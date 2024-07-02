package Factory;

import Factory.components.Button.Button;
import Factory.components.Button.WindowsButton;
import Factory.components.dropdown.Dropdown;
import Factory.components.dropdown.WindowsDropDown;
import Factory.components.menu.Menu;
import Factory.components.menu.WindowsMenu;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dropdown createDropDown() {
        return new WindowsDropDown();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
