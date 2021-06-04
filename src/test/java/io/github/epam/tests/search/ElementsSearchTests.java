package io.github.epam.tests.search;

import com.epam.jdi.light.elements.complex.DataList;
import io.github.com.search.Result;
import io.github.com.search.SearchResult;
import io.github.epam.StaticTestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.github.com.StaticSite.searchPage;
import static io.github.com.pages.Header.epamLogo;
import static io.github.com.pages.Header.search;
import static io.github.epam.data.ListData.*;
import static io.github.epam.tests.composite.steps.Preconditions.shouldBeLoggedIn;
import static org.hamcrest.Matchers.*;


public class ElementsSearchTests extends StaticTestsInit {
    @BeforeMethod
    public void before() {
        shouldBeLoggedIn();
        epamLogo.click();
        search("jdi");
    }

    @Test
    public void validateEntitiesTests() {
        DataList<SearchResult, Result> jobs = searchPage.firstSearchResults;

        jobs.assertThat(not(empty()))
                .and(hasSize(greaterThan(2)))
                .and(hasItem(CORRECT))
                .and(hasItems(CORRECT_2, CORRECT_3))
                .and(not(hasItem(WRONG)))
                .and(not(hasItems(WRONG, WRONG_2)));
    }

    @Test
    public void validateFilterTests() {
        DataList<SearchResult, Result> jobs = searchPage.firstSearchResults;

        jobs.assertThat().value(containsString(
                "name:JDI FACEBOOK GROUP; description:English Community Facebook group"))
                .any(e -> e.description.toLowerCase().contains("jdi"))
                .each(e -> e.name.toLowerCase().contains("jdi"))
                .onlyOne(e -> e.name.contains("OWNER"))
                .noOne(e -> e.name.equalsIgnoreCase("Selenium"));
    }
}
