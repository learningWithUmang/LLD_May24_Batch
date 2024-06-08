package ProducerConsumerSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize; //no of shelf in the store, isin't fixed?
    private ConcurrentLinkedDeque<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    /*
    List is not a thread safe Data structure
    In a multi threaded environment, we should always use a thread safe DS, i.e, Concurrent DS
     */

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem() {
        //3 threads are running the remove() method at the same time
        //[2,3] -> []
        System.out.println("Consumer consuming time, current size " + this.items.size());
        this.items.remove();
    }
}