package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        //ExecutorService ex2 = Executors.newCachedThreadPool();
        for(int i = 1 ; i <= 10000 ; i++){
            PrintNumber t = new PrintNumber(i);
            ex.submit(t);
        }
    }
}
