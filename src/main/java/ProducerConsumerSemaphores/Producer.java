package ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore prodSemaphore;
    private Semaphore consSemaphore;
    Producer(Store st, Semaphore prodSemaphore, Semaphore consSemaphore) {
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;
        this.store = st;
    }
    @Override
    public void run() {
        while(true) {
            //100 threads/producers are here, current size is 10 and maxSize is 80
            try {
                prodSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consSemaphore.release();
        }
    }
}