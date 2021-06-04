package io.github.com.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import io.github.com.sections.ContactForm;

public class Main {
    @Css("form#contact-form")
    public ContactForm contactForm;
}