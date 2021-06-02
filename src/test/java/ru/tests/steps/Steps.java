package ru.tests.steps;

import com.epam.jdi.light.elements.composite.WebPage;
import io.qameta.allure.Step;
import ru.tests.uiobjects.data.User;

import static ru.tests.uiobjects.site.SiteJdi.*;


public class Steps {
    private static void onSite() {
        if (!WebPage.getUrl().contains("https://jdi-testing.github.io/jdi-light/"))
            homePage.open();
    }
    @Step
    public static void shouldBeLoggedIn() {
        onSite();
        if (!userName.isDisplayed())
            login();
    }
    @Step
    public static void login() {
        userIcon.click();
        loginForm.submit(new User(), "enter");
    }
    @Step
    public static void shouldBeLoggedOut() {
        onSite();
        if (userName.isDisplayed())
            logout();
        if (loginForm.isDisplayed())
            userIcon.click();
    }
    @Step
    public static void logout() {
        if (!logout.isDisplayed())
            userIcon.click();
        logout.click();
    }
}
