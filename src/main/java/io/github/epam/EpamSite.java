package io.github.epam;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Frame;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import io.github.epam.pages.*;
import io.github.epam.sections.Header;
import org.openqa.selenium.WebElement;

import java.util.List;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class EpamSite {
    @Url("/index.html")
    public static HomePage homePage;
    @Url("/metals-colors.html")
    @Title("Metal and Colors")
    public static MetalAndColorsPage metalAndColorsPage;
    @Url("/contacts.html")
    @Title("Contact Form")
    public static ContactFormPage contactFormPage;
    @Url("/complex-table.html")
    @Title("Complex Table")
    public static WebPage complexTablePage;
    @Css("[ui=label]")
    public static List<WebElement> navigation;
    @Css("[ui=label]")
    public static WebList navigationWebList;

    @Css("header")
    public static Header header;

    @Frame("#jdi-frame-site")
    public static HomePageFrame iFrame;
    public static GithubPage githubPage;
}