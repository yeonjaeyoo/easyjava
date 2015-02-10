/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest12 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 5;
			int j = 0;
			
			if (i + j > 0) {
				System.out.println("i + j");
			}
			
			if (i / j > 0) {
				System.out.println("i / j");
			}
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누기.");
		} finally {
			System.out.println("항상 실행");
		}
	}

}
