package app;

/**
 * 
 * @author Maya
 *
 */
public class MyArray {
	
	/**
	 * prints out each element in the array
	 * @param <E> Type that represents element
	 * @param inputArray The array that is passed to be printed out
	 */
	public <E> void printArray(E[] inputArray) {
		//prints each element in the array
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		
	}
	
	/**
	 * creates different types of arrays and prints out the array's contents
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		//creates Integer, Double, Character arrays
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
		//print out each array
		MyArray ma = new MyArray();
		System.out.println("Array intArray contains:");
		ma.printArray(intArray); //pass Integer array
		System.out.println("\nArray doubleArray contains:");
		ma.printArray(doubleArray); //pass Double array
		System.out.println("\nArray charArray contains:");
		ma.printArray(charArray); //pass Character array
	}

}
