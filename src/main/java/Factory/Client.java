package Factory;

import Factory.components.Button.Button;
import Factory.components.dropdown.Dropdown;
import Factory.components.menu.Menu;
import Factory.constants.Platform;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.ANDROID);

        Button button = uiFactory.createButton();
        Dropdown dropdown = uiFactory.createDropDown();
        button.clickButton();
        button.showButton();

        dropdown.showDropDown();
    }
}
