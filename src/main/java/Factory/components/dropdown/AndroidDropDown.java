package Factory.components.dropdown;

public class AndroidDropDown implements Dropdown{
    @Override
    public void showDropDown() {
        System.out.println("Showing android dropdown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse android dropdown");
    }
}
