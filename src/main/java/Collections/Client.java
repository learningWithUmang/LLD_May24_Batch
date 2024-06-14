package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        /*
        Collection interface is the root interface of the Collections framework.
        Mainly 3 interfaces List, Queue, Set are further extended from the collection
        interface.

         */

        /*
        List Interface -> ArrayList, LinkedList, Stack, Vector
         */

        /*
        Array List - Resizeable implementation of List Interface
        Not thread safe
        ArrayList is actually implemented using Arrays
         */
        List<String> ls1 = new ArrayList<>();
        ls1.add("Umang");
        ls1.add("Kajal");
        ls1.add("Amruta");
        ls1.add("Shane");
        ls1.add("Gujjula");
        System.out.println(ls1);

        /*
        Implemented using DLL
        Not thread safe
        Random access using index is slower in Linked List as compared to in Array List
         */
        List<String> ls2 = new LinkedList<>();

        /*
        Thread safe, preferable in multi threaded environment
         */
        List<String> ls3 = new Vector<>();

        /*
        Extended from Vector only, supports LIFO
        Thread safe
         */
        List<String> ls4 = new Stack<>();

        /*
        Set Interface - Not thread safe
        No duplicate elements
        constant time operations for search, insert, delete - O(1)
         */

        //No order confirmation , random
        Set<String> s1 = new HashSet<>();
        s1.add("Umang");
        s1.add("Kajal");
        s1.add("Amruta");
        s1.add("Shane");
        s1.add("Gujjula");
        System.out.println(s1);

        //Oder will be retained
        Set<String> s2 = new LinkedHashSet<>();
        s2.add("Umang");
        s2.add("Kajal");
        s2.add("Amruta");
        s2.add("Shane");
        s2.add("Gujjula");
        System.out.println(s2);

        //Natural ordering
        Set<String> s3 = new TreeSet<>();
        s3.add("Umang");
        s3.add("Kajal");
        s3.add("Amruta");
        s3.add("Shane");
        s3.add("Gujjula");
        System.out.println(s3);

        /*
        EnumSet - Enum?
        Enums are nothing but constants. Whenever you've some predefined strings
        or contants, you use enums
         */

        Payment p1 = new Payment();
        p1.status = PaymentStatus.APPROVED;

        Payment p2 = new Payment();
        p2.status = PaymentStatus.REJECTED;

        /*
        ENUMSET is to play around with enums
         */
        Set<PaymentStatus> s4 = EnumSet.allOf(PaymentStatus.class);
        System.out.println(s4);

        EnumSet<PaymentStatus> s5 = EnumSet.of(PaymentStatus.WHICH_ONE, PaymentStatus.PENDING, PaymentStatus.APPROVED, PaymentStatus.DONE);
        EnumSet<PaymentStatus> s6 = EnumSet.complementOf(s5);
        System.out.println(s5);
        System.out.println(s6);

        /*
        Queue Interface
         */

        /*
        -1 - > first element comes first
        +1 -> second element appears first in final output
        0 -> doesn't matter
         */
        Queue<String> q1 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        q1.add("Umang");
        q1.add("Kajal");
        q1.add("Amruta");
        q1.add("Shane");
        q1.add("Gujjula");

        /*
        priority queue is nothing but heap data structure
        min heap and max heap, by default pq is min heap
         */
        System.out.println(q1.peek());
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.poll();
        }
        //I want to make it work like a max heap

        /*
        Done with List, Set and Queue interfaces.
        I am sharing a pdf along with notes at end of class, please go through it.
         */

        /*
        Comparable and Comparator Interfaces
         */

        Collections.sort(ls1, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        System.out.println(ls1);


        List<Student> ls5 = new ArrayList<Student>();

        Student st1 = new Student("Umang", 100, "ABC");
        Student st2 = new Student("Anshuman", 99.99, "Scaler");
        Student st3 = new Student("Kajal ji", 99.99, "Randomxyz");


        ls5.add(st1);
        ls5.add(st2);
        ls5.add(st3);

        Collections.sort(ls5);
        Collections.sort(ls5, new StudentPSPCompatator());
        Collections.sort(ls5, new StudentPSPUnivNameComparator());
//        Collections.sort(ls5, new Comparator<Student>() {
//            @Override

//            public int compare(Student student, Student t1) {
//                return 0;
//            }
//        });

        for(Student s : ls5){
            System.out.println(s.name + " " + s.psp + " " + s.univName);
        }

        /*
        Comaparator interface
         */

        /*
        To add syntatic sugar to code, there's a beautiful thing in Java
        known as Lambdas. It makes your code less bulky.
         */



    }
}
