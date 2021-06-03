package ru.tests.uiobjects.site;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.JList;
import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.openqa.selenium.WebElement;
import ru.tests.uiobjects.data.User;
import ru.tests.uiobjects.site.custom.MenuItem;
import ru.tests.uiobjects.site.pages.*;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class SiteJdi {
    public static HomePage homePage;
    public static JDIPerformancePage performancePage;
    public static ContactFormPage contactFormPage;
    public static ContactsPage contactsPage;
    public static UsersPage usersPage;
    @Css("form")
    public static Form<User> loginForm;

    @Css(".profile-photo [ui=label]")
    public static UIElement userName;
    @Css(".logout")
    public static WebElement logout;
    @Css("img#user-icon")
    public static UIElement userIcon;
    @UI(".sidebar-menu li")
    public static Menu leftMenu;
    @UI(".sidebar-menu li")
    public static JList<MenuItem> menu;

}
