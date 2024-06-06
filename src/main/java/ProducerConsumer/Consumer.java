package ProducerConsumer;

public class Consumer implements Runnable{
    private Store store;

    Consumer(Store st){
        this.store = st;
    }
    @Override
    public void run() {
        while(true) {
            //3 consumers have come at the same time but only 2 items are present
            //10 consumers are here and current size is 5
            synchronized (store) {
                //only 1 of them will come here at a time
                if (store.getItems().size() > 0) {
                    store.removeItem();
                }
            }
        }
    }
}