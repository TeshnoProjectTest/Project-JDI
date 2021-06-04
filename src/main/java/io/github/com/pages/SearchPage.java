package io.github.com.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.DataList;
import com.epam.jdi.light.elements.complex.JList;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitTimeout;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import io.github.com.search.Result;
import io.github.com.search.SearchResult;

public class SearchPage extends BasePage {
    @Css(".box")
    public DataList<SearchResult, Result> firstSearchResults;
    @Css(".box")
    public DataList<SearchResult, ?> secondSearchResults;
    @Css(".box")
    @WaitTimeout(3)
    public static DataList<SearchResult, ?> searchS;
    @Css(".box h3")
    public static JList<UIElement> jSearchTitle;
}
