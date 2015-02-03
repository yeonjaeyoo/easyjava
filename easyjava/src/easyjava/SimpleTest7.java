/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1 = 10;
		
		switch(iNum1) { 
			case 1:
				System.out.println("1");
			case 10 :
				System.out.println("10");
			default :
				System.out.println("default");
		}
		
		System.out.println("break 있을 때");
		
		switch(iNum1) { 
			case 1:
				System.out.println("1");
				break;
			case 10 :
				System.out.println("10");
				break;
			default :
				System.out.println("default");
				break;
		}
		
	}

}
