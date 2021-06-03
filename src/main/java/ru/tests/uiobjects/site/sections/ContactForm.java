package ru.tests.uiobjects.site.sections;

import com.epam.jdi.light.elements.complex.dropdown.DropdownSelect;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.common.TextArea;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import ru.tests.uiobjects.entities.Contacts;

import java.lang.reflect.Field;

import static com.epam.jdi.tools.ReflectionUtils.isInterface;

public class ContactForm extends Form<Contacts> {
    TextField firstName;
    TextField lastName;
    TextField position;
    TextField passportNumber;
    TextField passportSeries;
    DropdownSelect gender;
  //  MultiDropdown weather;

    Checkbox passport, acceptConditions;
    TextArea description;

    @Override
    public void fillAction(Field field, Object element, Object parent, String setValue) {
        if (isInterface(field, TextField.class))
            ((TextField) element).highlight();
        super.fillAction(field, element, parent, setValue);
    }
}