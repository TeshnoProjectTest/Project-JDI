package io.github.com.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.openqa.selenium.WebElement;

public class HomePage extends WebPage {
    @Css("h3[name='main-title']")
    public static WebElement title;
    @Css(".main-txt")
    public static UIElement jdiText;
    @UI("['JDI Github']")
    public static WebElement githubLink;
}