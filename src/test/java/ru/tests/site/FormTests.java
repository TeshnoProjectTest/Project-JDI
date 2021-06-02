package ru.tests.site;

import com.epam.jdi.light.elements.composite.Form;
import org.testng.annotations.Test;
import ru.tests.TestsInit;
import ru.tests.uiobjects.entities.Contacts;

import static ru.tests.steps.Steps.shouldBeLoggedIn;
import static ru.tests.steps.Steps.shouldBeLoggedOut;
import static ru.tests.uiobjects.entities.Defaults.DEFAULT_CONTACT;
import static ru.tests.uiobjects.entities.Defaults.DEFAULT_USER;
import static ru.tests.uiobjects.site.SiteJdi.*;
import static ru.tests.uiobjects.site.pages.ContactFormPage.contactForm;


public class FormTests implements TestsInit {

    @Test
    public void loginTest() {
        shouldBeLoggedOut();
        userIcon.click();
        loginForm.loginAs(DEFAULT_USER);
        homePage.checkOpened();
    }

    @Test
    public void fillContactFormTest() {
        shouldBeLoggedIn();
        contactFormPage.shouldBeOpened();
        contactForm.submit(DEFAULT_CONTACT);
        contactForm.check(DEFAULT_CONTACT);
    }

    @Test
    public void fillContactsTest() {
        shouldBeLoggedIn();
        contactsPage.shouldBeOpened();
        Form<Contacts> contactFrom = contactsPage.asForm();
        contactFrom.submit(DEFAULT_CONTACT);
        contactFrom.check(DEFAULT_CONTACT);
    }
}
