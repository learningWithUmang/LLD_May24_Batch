package ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore prodSemaphore;
    private Semaphore consSemaphore;

    Consumer(Store st, Semaphore prodSemaphore, Semaphore consSemaphore){
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;
        this.store = st;
    }
    @Override
    public void run() {
        while(true) {
            //3 consumers have come at the same time but only 2 items are present
            //10 consumers are here and current size is
                //only 1 of them will come here at a time
            try {
                consSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSemaphore.release();
        }
    }
}