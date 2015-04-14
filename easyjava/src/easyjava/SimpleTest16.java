/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest16 {
	private static int i = 0;
	private int j = 0;
	
	public SimpleTest16() {
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
