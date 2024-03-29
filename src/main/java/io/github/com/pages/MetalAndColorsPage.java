package io.github.com.pages;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.ByText;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import org.openqa.selenium.WebElement;

public class MetalAndColorsPage extends WebPage {
    @JDropdown(root = "div[ui=dropdown]", value = ".filter-option",
            list = "li", expand = ".caret")
    public static Dropdown colors;
    @JDropdown(root = "//div[@ui='dropdown']", value = "//*[contains(@class, 'filter-option')]",
            list = "//li", expand = "//*[contains(@class, 'caret')]")
    public static Dropdown colorsXpath;
    @JDropdown(root = "div[ui=combobox]", value = "input",
            list = "li", expand = ".caret")
    public static Dropdown metals;
    @ByText("Calculate")
    public static WebElement calculate;
    @ByText("Submit")
    public static WebElement submit;
}