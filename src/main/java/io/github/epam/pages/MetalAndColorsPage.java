package io.github.epam.pages;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;

public class MetalAndColorsPage extends WebPage {
    @JDropdown(root = "div[ui=dropdown]", value = ".filter-option",
            list = "li", expand = ".caret")
    public Dropdown colors;
    @JDropdown(root = "div[ui=combobox]", value = "input",
            list = "li", expand = ".caret")
    public Dropdown metals;
}