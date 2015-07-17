package easyjava;

import java.util.Vector;

public class RemoveElementFromVectorByIndexExample {
	public static void main(String[] args) {
		// create a Vector object
		Vector v = new Vector();

		// Add elements to Vector
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");

		/*
		 * To remove an element from the specified index of Vector use Object
		 * remove(int index) method. It returns the element that was removed
		 * from the Vector.
		 */
		Object obj = v.remove(1);
		System.out.println(obj + " is removed from Vector");

		System.out.println("Vector contents after remove call...");
		// display elements of Vector
		for (int index = 0; index < v.size(); index++)
			System.out.println(v.get(index));

		/*
		 * void removeElement(int index) is also identical to the remove method
		 * but remove method returns the element that was removed while return
		 * type of removeElementAt method is void.
		 */
		v.removeElementAt(2);

		System.out.println("Vector contents after removeElementAt call...");
		// display elements of Vector
		for (int index = 0; index < v.size(); index++)
			System.out.println(v.get(index));
		
//		2 is removed from Vector
//		Vector contents after remove call...
//		1
//		3
//		4
//		5
//		Vector contents after removeElementAt call...
//		1
//		3
//		5

	}
}
