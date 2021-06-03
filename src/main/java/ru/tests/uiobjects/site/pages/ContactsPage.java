package ru.tests.uiobjects.site.pages;

import com.epam.jdi.light.elements.complex.dropdown.DropdownSelect;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.common.TextArea;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import ru.tests.uiobjects.site.custom.MultiDropdown;

@Url("/contacts.html")
@Title("Contact Form")
public class ContactsPage extends WebPage {
    TextField firstName;
    TextField lastName;
    TextField position;
    TextField passportNumber;
    TextField passportSeries;
    DropdownSelect gender;
    MultiDropdown weather;

    Checkbox passport;
    Checkbox acceptConditions;
    TextArea description;

    @UI("['Submit']")
    public Button submit;
}