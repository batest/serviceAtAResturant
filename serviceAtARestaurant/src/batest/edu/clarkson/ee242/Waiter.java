package batest.edu.clarkson.ee242;

public class Waiter {

	private final static int MAX_WAITER_MILLIS = 4000; // must wait for between 0 and 4 seconds.
	private final static int N_COURSES = 3; // number of courses is exactly three.
	private Table[] tables; // array of Table objects this Waiter waits on
	private String waiterName; // name of this Waiter
	private String[] customerNames; // names of Customers served by Waiter
	private String[][] courses; // multi-dimensional array of courses for each Customer of this Waiter.
	//(courses[i][j] has the j-th course for the i-th Customer of this Waiter)
	 
	public Waiter( Table[] tables, String waiterName, String[] customerNames, String[][] courses ){
		
	}
	// initializes the data 
	public void run(){
	/* For each customer,
	a thread on this Waiter object serves the three courses in the correct order
	 by calling the serve() method in the corresponding Table,
	 prints out what course is served to which Customer,
	 and sleeps for a random time between 0 & 4 seconds to mimic time taken in serving.*/
	}
}
