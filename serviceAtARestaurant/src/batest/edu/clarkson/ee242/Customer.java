package batest.edu.clarkson.ee242;
import java.util.Random;

//Customer is the Consumer
//The consumer thread is created about an object
//instantiated from this class
public class Customer implements Runnable {

	private final static int MAX_CUSTOMER_MILLIS = 4000;
	private Table table; // Table object that this Customer sits at
	private String customerName; // name of this Customer
    public Customer() {

    }

    public void run() {
        
    }
}

