package Factory.components.Button;

public class IOSButton implements Button{
    @Override
    public void showButton() {
        System.out.println("Showing ios button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking ios button");
    }
}
