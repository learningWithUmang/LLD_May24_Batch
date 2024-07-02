package Factory;

import Factory.components.Button.AndroidButton;
import Factory.components.Button.Button;
import Factory.components.dropdown.AndroidDropDown;
import Factory.components.dropdown.Dropdown;
import Factory.components.menu.Menu;

public class AndrioidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
