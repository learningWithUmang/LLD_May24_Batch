package RTPoly;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        B b = new B();
        b.doSomething("dwecvb");

        A a = new A();
        a.doSomething("Dfcvjd");

        A a1 = new B();
        a1.doSomething("dcvc");

        List<A> ls = new ArrayList<>();
        ls.add(new A());
        ls.add(new B());
        ls.add(new C());

        for(A it : ls){
            it.doSomething("sdjfhb");
        }
    }
}
