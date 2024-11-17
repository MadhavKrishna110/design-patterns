package org.example.factory.abstractfactory.dark;

import org.example.factory.abstractfactory.Button;
import org.example.factory.abstractfactory.Menu;
import org.example.factory.abstractfactory.Theme;
import org.example.factory.abstractfactory.ThemeComponentFactory;

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
