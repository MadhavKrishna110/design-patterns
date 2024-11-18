package org.example.creational.factory.abstractfactory.dark;

import org.example.creational.factory.abstractfactory.Button;
import org.example.creational.factory.abstractfactory.Menu;
import org.example.creational.factory.abstractfactory.ThemeComponentFactory;

public class DarkComponentFactory implements ThemeComponentFactory {
    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }

    @Override
    public Button createButton() {
        return new DarkButton();
    }

}
