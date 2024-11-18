package org.example.creational.factory.abstractfactory.dark;

import org.example.creational.factory.abstractfactory.Theme;
import org.example.creational.factory.abstractfactory.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return null;
    }
}
