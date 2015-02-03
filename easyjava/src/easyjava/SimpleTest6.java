/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1 = 10;
		int iNum2 = 5;
		
		int result, result2;
		
		if(iNum1 < iNum2) 
			result = iNum2; 
		else 
			result = iNum1;
				
		System.out.println("result=" + result);
		result2 = (iNum1 < iNum2) ? iNum2:iNum1;
		System.out.println("result2=" + result2);
	}

}
