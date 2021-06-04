package io.github.com.search;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;

public class SearchResult extends Section {
    @Title
    @Css("h3")
    public UIElement name;
    @Css("p")
    public UIElement description;
    @Css("a")
    public UIElement link;
}
