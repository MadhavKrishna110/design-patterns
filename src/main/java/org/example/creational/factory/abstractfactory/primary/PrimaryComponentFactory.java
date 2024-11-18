package org.example.creational.factory.abstractfactory.primary;

import org.example.creational.factory.abstractfactory.Button;
import org.example.creational.factory.abstractfactory.Menu;
import org.example.creational.factory.abstractfactory.ThemeComponentFactory;

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
