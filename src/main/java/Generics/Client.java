package Generics;

import RTPoly.C;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair p1 = new Pair();
        /*
        Used till Java 5
        By default, if you don't pass the data types, it can take any values
        it'll be of Object type
        Also known as Raw types
         */
        p1.first = "ABC";
        p1.second = 998978;

        Pair<Integer, String> p2 = new Pair<>();
        p2.first = 12;
        p2.second = "Umang";
        String  res = p2.second;
        /*
        Is it applying a CT check??
         */
        Pair<Integer, String> p3 = new Pair</*optional here*/Integer, String>();

        HashMap hm = new HashMap();
        hm.put("umang", "agrawal");
        hm.put(12, 90.4);
        hm.put("Sff", 42);

        HashMap<Integer, String > hm2 = new HashMap<>();
        hm2.put(12,"Umang");
        hm2.put(123, "something");
        /*
        For CPP
        vector<int> v;
        map<int,int> mp;
        Pair<int,int> p1;
         */

        //Backward compatability - older things should not break

        /*
        Generics will help us fail fast (at compite time, it will apply data type check)
         */


        Pair<Integer, Integer> p11 = new Pair<>();
        Pair<Integer, String > p12 = new Pair<>();
        Pair<Integer, Long> p13 = new Pair<>();
        Pair<Integer, Double> p14 = new Pair<>();

        p11.doSomethingNonStatic(12);
        Pair.<String, Integer>doSomethingStatic("Umang", 13);
        Pair.doSomethingStatic("anything", 12);

        //Pair.doSomethingStatic(23);
        /*
        Static methods cannot refer a class level generic data type as to call thse
        mthods, we don't need an object and because of which we will able not be able to
        know the respective data type you're referring to
         */

        Integer res1 = p13.doSomethingForLearning(23);
        Long res2 = p13.doSomethingForLearning(1232L);
        Integer res3 = p13.<Integer>doSomethingForLearning(12);



        /*
        Inheritance and Generics
         */

        Utils.simpleDoSomething(new Animal());
        Utils.simpleDoSomething(new Dog());
        Utils.simpleDoSomething(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        List<Animal> animals = new ArrayList<>();

        Utils.doSomething(dogs);
        Utils.doSomething(cats);
        Utils.doSomething(animals);

        Utils.printAnimalNames(animals);
        Utils.printAnimalNames(dogs);
        Utils.printAnimalNames(cats);


        Utils.doSomething2(dogs);
        Utils.doSomething2(cats);
        Utils.doSomething2(animals);
        /*
        We cannot store List<Dog> in List<Animal> - Not allowed
        We can store only Dog in Animal
         */
    }
}
