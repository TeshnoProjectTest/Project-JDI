package io.github.epam.enums;

public enum Navigation {
    Home,
    ContactForm("Contact form"),
    Support,
    Dates,
    Service,
    ComplexTable("Complex Table"),
    SimpleTable("Simple Table"),
    UserTable("User Table"),
    TableWithPages("Table with pages"),
    DifferentElements("Different elements"),
    MetalsColors("Metals & Colors");

    public String value;

    Navigation() {
        value = toString();
    }

    Navigation(String value) {
        this.value = value;
    }
}
