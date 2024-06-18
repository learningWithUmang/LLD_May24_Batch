package LambdasStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        /*
        Runnable
        Callable
        Comparable
        Comparator
        Some of the interfaces who demand just one method to be implemented.

        Functional interfaces - Interfaces which demand just one method.
        Lambdas - Way to create objects of classes who implement functional interfaces

        () -> {} - syntax of a lambda expression in jave
        (input to the function/method) -> {output from the method}
         */

        List<Student> ls = new ArrayList<>();
        ls.add(new Student("Umang", 90, "ABC"));
        ls.add(new Student("Abhishek", 99, "CVB"));
        ls.add(new Student("Varudhni", 100, "XYZ"));

        /*
        I want to sort this student list
         */

        Collections.sort(ls); //sort as per natural ordering defined in the class

        Collections.sort(ls, new StudentPSPCompatator());
        Collections.sort(ls, new StudentPSPUnivNameComparator());

        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.univName.compareTo(t1.univName);
            }
        });

        /*
        You can even beautify the above code.
         */

        Collections.sort(ls, (Student student, Student t1) -> {
            return student.univName.compareTo(t1.univName);
        });

        /*
        Lambdas are just syntactical sugars.
         */
        /*
        I want to print hello world using a thread
         */

        HelloWorldPrint task1 = new HelloWorldPrint();
        Thread t1 = new Thread(task1);
        t1.start();

        Runnable r = () -> {
            System.out.println("Hello world");
        };

        Thread tx = new Thread(r);
        tx.start();

        Thread t2 = new Thread(() -> {
            System.out.println("Hello World");
        });

        t2.start();

        Thread t3 = new Thread(() -> System.out.println("Hello world"));
        t3.start();
        /*
        Curly braces are optional if there's only 1 line of code in method.
         */
//        if(4 > 5)
//            System.out.println("fn");

        /*
        I want to do some arithmetic operations
        Addition
        Subtraction
        Multiplication
        Division
         */
        MathematicalOperation additionOperation = (int a, int b) -> a + b;

        MathematicalOperation subtractionOperation = (int a, int b) -> a - b;

        MathematicalOperation multiOperation = (int a, int b) -> a * b;

        MathematicalOperation complexOperation = (int a, int b) -> {
          if(a < b){
              return a*b;
          }else if(b < a){
              return a - b;
          }else{
              return a / b;
          }
        };

        System.out.println(additionOperation.operate(2,4));
        System.out.println(subtractionOperation.operate(5,6));
        System.out.println(multiOperation.operate(19,23));
        System.out.println(complexOperation.operate(21,12));

        Additon op = new Additon();
        System.out.println(op.operate(12,2));

        /*
        Lambdas are going to help create objects of classes who implement function interfaxes
        This is all about Lamdas
         */


        /*
        Streams - like a pipeline
        Data (pipeline attached to some data source)
        Print 1000 rows
        for(int i  = 1 ; i < = 1000 ; i++){
            if( i == 500th) {
                ....
            }
        }

        Streams will affect / improve performance on a positive side.
        Stream uses very complex tree like Data structures which makes the
        stream smart enough to optimize things.
         */

        List<Integer> lst = List.of(2,5,3,10,8,9,1);
        Stream<Integer> st1 = lst.stream();
        Stream<Integer> st2 = lst.stream();
        Stream<Integer> st3 = lst.stream();
        /*
        st1 is nothing but like a pipeline attached to the list.
        It's actually a stream reference
         */
        System.out.println(st1);

        /*
        There are methods using which you can read data from the stream.
        Intermediate - returns the stream reference
        Terminal - returns the data, stream will be closed after this.
         */

        //System.out.println(st1.limit(3).count());
        //System.out.println(st2.count()); // Terminal methods
        //System.out.println(st3.limit(3).count());

        //System.out.println(st1.count());

        /*
        You can have as many methods as you want on top of stream
         */
//        for(int i = 0 ; i < lst.size() ; i++){
//            System.out.println(lst.get(i));
//        }

        st2.forEach((x) -> {
            System.out.println(x + " ");
        });

        //System.out.println(st2.count()); already the stream is closed

        /*
        filter
        sort
        reduce
         */

        List<Integer> res = lst
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(res);

        /*
        map
         */

        /*
        for loop to filter even elements - store in a list
        for loop to map each of them to their squares  - sote in list
        sorting logic to store
         */

        List<Integer> res2 = lst
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x,y) -> y - x )
                .collect(Collectors.toList());

        System.out.println(res2);
        /*
        findFirst() , reduce
         */
        //[3,5,7,9]
        Optional<Integer> res3 = lst
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x,y) -> y - x )
                .findFirst();

        if(res3.isPresent()){
            System.out.println("Here's the filtered first final element  " + res3.get());
        }else{
            System.out.println("Nothing is left");
        }

        /*
        reduce method
        I want to sum up all elements of a list
         */
        Integer ans = 0;
        for(int i = 0 ; i < lst.size() ; i++){
            ans += lst.get(i);
        }

        System.out.println(lst);
        /*
        Streams doesn't affect the actual data sources
         */

        Integer res4 = lst.stream().
                filter((elem) -> elem % 2 != 0)
                .map((elem) -> elem*elem*elem)
                .reduce(0, (a, b) -> a + b);
        System.out.println(res4);

        /*
        I want to find minimum from the final output
         */
        Integer mn = Integer.MAX_VALUE;
        for(Integer it : lst){
            mn = Math.min(it, mn);
        }

        Integer res5 = lst
                .stream()
                .filter((elem) -> elem % 2 == 0)
                .map((elem) -> elem * elem)
                .sorted((x,y) -> y - x )
                .reduce(Integer.MAX_VALUE, (a,b) -> Math.min(a,b));

        System.out.println(res5);

        /*
        Does the order of applying the stream methods matter??
        The order will definetely affect the performane because the output of current stream method
        will become input of the next

         */



    }
}
