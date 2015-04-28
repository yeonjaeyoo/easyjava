/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 10;
		if(i == 0 && j < 9) {
			System.out.println("&& 연산자 참");
		} else {
			System.out.println("&& 연산자 거짓");
		}
		
		if(i == 0 || j < 9) {
			System.out.println("|| 연산자 참");
		} else {
			System.out.println("|| 연산자 거짓");
		}
		
		if(!(i==1)) {
			System.out.println("!연산자");
		}
		
		
	}

}
