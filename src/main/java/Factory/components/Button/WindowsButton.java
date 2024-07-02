package Factory.components.Button;

public class WindowsButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing windows button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking windows button");
    }
}
