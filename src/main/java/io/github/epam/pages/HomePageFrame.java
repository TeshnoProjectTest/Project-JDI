package io.github.epam.pages;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import org.openqa.selenium.WebElement;

public class HomePageFrame extends Section {
	@Css("img#user-icon") public WebElement userIcon;
}