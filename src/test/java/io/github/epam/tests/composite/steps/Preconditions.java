package io.github.epam.tests.composite.steps;

import io.qameta.allure.Step;

import static io.github.com.StaticSite.homePage;
import static io.github.com.pages.Header.*;
import static io.github.epam.entities.Users.DEFAULT_USER;

public class Preconditions {
    @Step
    public static void shouldBeLoggedIn() {
        homePage.shouldBeOpened();
        if (!userName.isDisplayed())
            login();
    }

    @Step
    public static void login() {
        userIcon.click();
        loginForm.submit(DEFAULT_USER, "enter");
    }

    @Step
    public static void shouldBeLoggedOut() {
        homePage.shouldBeOpened();
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
