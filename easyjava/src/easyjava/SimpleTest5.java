/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1 = 10;
		int iNum2 = 5;
		
		String str1 = "AAA";
		String str2 = "aaa";
		
		if(iNum1 < iNum2) {
			System.out.println("iNum2이 크다.");
		} else if(iNum1 > iNum2) {
			System.out.println("iNum1이 크다.");
		} else {
			System.out.println("같다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("문자가 같다.");
		} else {
			System.out.println("문자가 다르다.");
		}
		
	}

}
