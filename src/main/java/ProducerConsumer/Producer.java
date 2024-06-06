package ProducerConsumer;

public class Producer implements Runnable{
    private Store store;
    Producer(Store st) {
        this.store = st;
    }
    @Override
    public void run() {
        while(true) {
            //100 threads/producers are here, current size is 10 and maxSize is 80
            synchronized (store) {
                if (store.getItems().size() < store.getMaxSize()) {
                    store.addItem();
                }
            }
        }
    }
}