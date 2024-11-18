package org.example.factory.abstractfactory.primary;

import org.example.factory.abstractfactory.Theme;
import org.example.factory.abstractfactory.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createComponentFactory() {
        return null;
    }
}
