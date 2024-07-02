package Factory.components.dropdown;

public class WindowsDropDown implements Dropdown{
    @Override
    public void showDropDown() {
        System.out.println("Showing windows dropdown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse windows dropdown");
    }
}
