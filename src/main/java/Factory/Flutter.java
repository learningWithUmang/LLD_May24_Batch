package Factory;

import Factory.constants.Platform;

public class Flutter {
    //Non factory methods

    void refreshUI(){
        System.out.println("Refreshing the UI");
    }

    void setTheme(){
        System.out.println("Setting theme");
    }

    /*
    getUIFactory actually returns the object corresponding to the platform type
    factory method
     */
    /*
    The code of if else for creating corresponding object is moved to
    UIFactoryFactory class  - Practical Factory Design pattern.
     */
    UIFactory getUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
