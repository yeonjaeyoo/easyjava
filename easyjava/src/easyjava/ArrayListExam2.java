package easyjava;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListExam2 {

	public static void main(String[] args) {

		//create an ArrayList object
		ArrayList<String> arrayList = new ArrayList<String>();

		//Add elements to Arraylist
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");

		//create a new Vector object
		Vector<String> v = new Vector<String>();
		v.add("4");
		v.add("5");
		
		/*
  		To append all elements of another Collection to ArrayList use
		boolean addAll(Collection c) method.
		It returns true if the ArrayList was changed by the method call.
		 */
		
		//append all elements of Vector to ArrayList
		arrayList.addAll(v);
		
		//display elements of ArrayList
		System.out.println("After appending all elements of Vector, ArrayList contains..");
		
		for(int i=0; i<arrayList.size(); i++)
			System.out.println(arrayList.get(i));
		}
	
		//After appending all elements of Vector, ArrayList contains..
		//1
		//2
		//3
		//4
		//5
}
