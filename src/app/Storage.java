package app;

/**
 * 
 * @author Maya
 *
 * @param <T> Type for first element
 */
public class Storage<T> {

	private T s = null;
	
	/**
	 * Storage constructor
	 * @param s The value that is being used
	 */
	public Storage(T s) {
		this.s = s;
	}
	
	/**
	 * Returns the data
	 * @return s The value that was inputed
	 */
	public T getData() {
		return this.s;
	}
	
	/**
	 * prints out data for different types of arrays
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		//creates String array and prints out its data
		Storage<String> storage1 = new Storage<String>("Maya");
		System.out.println("This is the data: " + storage1.getData());
		//creates Integer array and prints out its data
		Storage<Integer> storage2 = new Storage<Integer>(18);
		System.out.println("This is the data: " + storage2.getData());

	}

}
