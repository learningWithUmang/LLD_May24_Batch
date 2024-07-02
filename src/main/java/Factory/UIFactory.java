package Factory;

import Factory.components.Button.Button;
import Factory.components.dropdown.Dropdown;
import Factory.components.menu.Menu;

public interface UIFactory {
    //Factory methods

    Button createButton();
    Menu createMenu();
    Dropdown createDropDown();
}
