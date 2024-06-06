package AdderSubtractorSyncMethods;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();

        ExecutorService ex = Executors.newCachedThreadPool();

        Adder t1 = new Adder(count);
        Subtractor t2 = new Subtractor(count);

        Future<Void> res1 = ex.submit(t1);
        Future<Void> res2 = ex.submit(t2);

        res1.get();
        res2.get();

        System.out.println(count.value);
    }
}
