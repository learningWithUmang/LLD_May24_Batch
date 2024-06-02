package Threads;

public class PrintHelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world");
        System.out.println("Printing hello world in Thread :- " + Thread.currentThread().getName());
    }
}
