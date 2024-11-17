package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.primary.PrimaryTheme;

public class Client {
    public static void main(String[] args) {

        Theme primaryTheme = new PrimaryTheme();
        ThemeComponentFactory themeComponentFactory = primaryTheme.createComponentFactory();

        Button button = themeComponentFactory.createButton();
        Menu menu = themeComponentFactory.createMenu();
    }
}
