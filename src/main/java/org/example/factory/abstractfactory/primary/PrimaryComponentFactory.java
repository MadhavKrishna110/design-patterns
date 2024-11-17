package org.example.factory.abstractfactory.primary;

import org.example.factory.abstractfactory.Button;
import org.example.factory.abstractfactory.Menu;
import org.example.factory.abstractfactory.Theme;
import org.example.factory.abstractfactory.ThemeComponentFactory;

public class PrimaryComponentFactory implements ThemeComponentFactory {
    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }

    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

}
