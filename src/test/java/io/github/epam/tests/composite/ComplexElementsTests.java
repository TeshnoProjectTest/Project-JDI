package io.github.epam.tests.composite;

import io.github.epam.StaticTestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.common.WindowsManager.originalWindow;
import static com.epam.jdi.light.settings.JDISettings.ELEMENT;
import static io.github.com.StaticSite.*;
import static io.github.com.pages.HomePage.githubLink;
import static io.github.com.pages.HomePage.jdiText;
import static io.github.com.pages.MetalAndColorsPage.*;
import static io.github.epam.enums.ColorsList.Green;
import static io.github.epam.enums.Metals.Gold;
import static io.github.epam.enums.Navigation.*;
import static io.github.epam.enums.NavigationNums.nContactForm;
import static io.github.epam.enums.NavigationNums.nHome;
import static io.github.epam.tests.composite.steps.Preconditions.shouldBeLoggedIn;
import static org.hamcrest.Matchers.containsString;

public class ComplexElementsTests extends StaticTestsInit {
    @BeforeMethod
    public void before() {
        shouldBeLoggedIn();
        metalAndColorsPage.shouldBeOpened();
    }

    @Test
    public void complexXpathTest() {
        colorsXpath.select(Green);
    }

    @Test
    public void complexTest() {
        colors.select(Green);
        metals.select(Gold);
    }

    @Test
    public void navigationListTest() {
        navigation.get(nContactForm).click();
        contactFormPage.checkOpened();
        navigation.get(nHome).click();
        jdiText.is().text(containsString("QUIS NOSTRUD EXERCITATION"));
        githubLink.click();
        originalWindow();
    }

    @Test
    public void navigationMenuTest() {
        navigationL.select(ContactForm);
        contactFormPage.checkOpened();
        navigationL.select(Home);
        homePage.checkOpened();
        navigationL.select(Service);
        navigationL.select(ComplexTable);
    }

    @Test
    public void navigationMenuTemplate() {
        navigationS.select(ContactForm);
        contactFormPage.checkOpened();
        menu.select(Home);
        homePage.checkOpened();
        navigationL.select(ELEMENT.startIndex + 3);
        menu.select(ComplexTable);
    }
}
