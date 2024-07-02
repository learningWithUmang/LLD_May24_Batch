package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.IOSButton;
import Factory.components.dropdown.Dropdown;
import Factory.components.dropdown.IOSDropDown;
import Factory.components.menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
