/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
interface Phone {
	public void getName();
}

public class SimpleTest13 implements Phone {
	public void getName() {
		System.out.println("안드로이도.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleTest13 st13 = new SimpleTest13();
		st13.getName();
	}
}
