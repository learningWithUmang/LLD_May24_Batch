package Threads;

public class Client {
    static void doSomething(){
        System.out.println("Printing something in Thread :- " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
//        //System.out.println("Thread name :- " + Thread.currentThread().getName());
//        //doSomething();
//        //System.out.println("Hello world");
//
//        PrintHelloWorld task1 = new PrintHelloWorld();
//        Thread t1 = new Thread(task1);
//        //t1.start();
//
//        PrintNumber task2 = new PrintNumber(1);
//        Thread t2 = new Thread(task2);
//        //t2.start();


        /*
        Print all numbers from 1 to 100 using 100 different threads
         */

        for(int i = 1 ; i <= 1000 ; i++){
            PrintNumber task = new PrintNumber(i);
            Thread t = new Thread(task);
            t.start();
        }

    }
}
