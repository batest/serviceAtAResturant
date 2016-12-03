package batest.edu.clarkson.ee242;


public class Table {

	private String course; // the name of the course
	private boolean isEmpty; // a flag used to see if the table is empty or is not empty (i.e., has an unfinished course)
	private Object obj; // synchronization object, not strictly necessary (i.e., depends on the synchronization method you use)

	public Table(){
		// default constructor
	}
	public void serve(){
		// implements the Waiter serving a course
	}
	public String eat(){
		// implements the Customer eating a course
		return null;
	}
	
}
