package org.example.creational.factory.abstractfactory.primary;

import org.example.creational.factory.abstractfactory.Theme;
import org.example.creational.factory.abstractfactory.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return null;
    }
}
