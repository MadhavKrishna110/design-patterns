package org.example.factory.abstractfactory;
// Step - 1 Create Parent Class
public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;

    public abstract ThemeComponentFactory createComponentFactory();

}
