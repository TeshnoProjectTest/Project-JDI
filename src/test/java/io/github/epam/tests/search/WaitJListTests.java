package io.github.epam.tests.search;

import io.github.epam.StaticTestsInit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.settings.JDISettings.TIMEOUTS;
import static io.github.com.StaticSite.homePage;
import static io.github.com.pages.Header.search;
import static io.github.com.pages.SearchPage.jSearchTitle;
import static io.github.epam.tests.composite.steps.Preconditions.shouldBeLoggedIn;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

public class WaitJListTests extends StaticTestsInit {
    @BeforeMethod
    public void before() {
        homePage.shouldBeOpened();
        shouldBeLoggedIn();
        search("jdi");
    }

    @Test
    public void notEmptyTest() {
        jSearchTitle.assertThat(not(empty()));
    }

    @Test
    public void emptyTest() {
        jSearchTitle.waitSec(2);
        try {
            jSearchTitle.is().empty();
            Assert.fail("List should not be empty");
        } catch (Throwable ex) {
        } finally {
            jSearchTitle.waitSec(TIMEOUTS.element.get());
        }
    }

    @Test
    public void sizeTest() {
        assertEquals(jSearchTitle.size(), 6);
        jSearchTitle.has().size(equalTo(8));
    }

    @Test
    public void sizeNotEmptyTest() {
        jSearchTitle.has().size(greaterThan(7));
    }
}
