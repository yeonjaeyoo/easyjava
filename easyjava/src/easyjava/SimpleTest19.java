/**
 * 
 */
package easyjava;

import java.util.Hashtable;

/**
 * @author educar
 *
 */
public class SimpleTest19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> testHash = new Hashtable<String, String>();
		testHash.put("1", "1번째");
		testHash.put("2", "2번째");
		testHash.put("3", "3번째");
		
		System.out.println("Hashtable size="+testHash.size());
		
		for(int i=1;i <=testHash.size();i++) {
			System.out.println("출력("+i+")="+testHash.get(Integer.toString(i)));
		}
		
	}

}
