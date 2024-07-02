package Factory.components.dropdown;

public class IOSDropDown implements Dropdown{
    @Override
    public void showDropDown() {
        System.out.println("Showing ios dropdown");
    }

    @Override
    public void collapse() {
        System.out.println("Collapse ios dropdown");
    }
}
