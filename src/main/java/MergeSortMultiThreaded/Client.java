package MergeSortMultiThreaded;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();

        List<Integer> ls = List.of(1,4,56,3,2,43,2,3,32,23,3);



        Sorter t = new Sorter(ls, ex);

        Future<List<Integer>> res = ex.submit(t);

        ls = res.get();

        System.out.println(ls);

    }
}
