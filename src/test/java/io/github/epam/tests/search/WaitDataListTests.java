package io.github.epam.tests.search;

import io.github.epam.StaticTestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.homePage;
import static io.github.com.pages.Header.search;
import static io.github.com.pages.SearchPage.searchS;
import static io.github.epam.tests.composite.steps.Preconditions.shouldBeLoggedIn;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

public class WaitDataListTests extends StaticTestsInit {
    @BeforeMethod
    public void before() {
        homePage.shouldBeOpened();
        shouldBeLoggedIn();
        search("jdi");
    }

    @Test
    public void notEmptyTest() {
        searchS.assertThat(not(empty()));
    }

    @Test
    public void sizeTest() {
        assertEquals(searchS.size(), 6);
        searchS.has().size(equalTo(8));
    }

    @Test
    public void sizeGreaterTest() {
        searchS.has().size(greaterThan(7));
    }
}
