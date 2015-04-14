/**
 * 
 */
package easyjava;

import java.util.Vector;

/**
 * @author educar
 *
 */
public class SimpleTest18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> testVec = new Vector<String>();
		testVec.add("1번째");
		testVec.add("2번째");
		testVec.add("3번째");
		
		System.out.println("Vector size="+testVec.size());
		
		for(int i=0;i <testVec.size();i++) {
			System.out.println("출력("+i+")="+testVec.elementAt(i));
		}
		
	}

}
