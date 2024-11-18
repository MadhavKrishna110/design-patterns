package org.example.factory.abstractfactory.dark;

import org.example.factory.abstractfactory.Theme;
import org.example.factory.abstractfactory.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return null;
    }
}
