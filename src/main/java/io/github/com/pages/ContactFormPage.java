package io.github.com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;

public class ContactFormPage extends WebPage {
    @Css(".main-form")
    public static Main main;
}