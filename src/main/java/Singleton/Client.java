package Singleton;

import javax.xml.crypto.Data;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) {
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        DatabaseConnection dbc2 = DatabaseConnection.getInstance();
        System.out.println(dbc1);
        System.out.println(dbc2);
    }
}
