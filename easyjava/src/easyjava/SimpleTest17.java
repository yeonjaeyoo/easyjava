/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest17 {
	private static int i;
	private int j = 0;
	
	static {
		i = 0;
	}
	
	public SimpleTest17() {
		++i;
		++j;
	}
	
	public void printNumber() {
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("첫번째 호출");
		SimpleTest16 st1 = new SimpleTest16();
		st1.printNumber();
		
		System.out.println("두번째 호출");
		SimpleTest16 st2 = new SimpleTest16();
		st2.printNumber();
	}
}
