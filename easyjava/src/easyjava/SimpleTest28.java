/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest28 {
	public static int cnt = 0;
	
	public static void printCount() {
		int k = 0;
		k++;
		cnt++;
		
		System.out.println("k="+k);
		System.out.println("cnt="+cnt);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleTest28 mySimpleTest28 = new SimpleTest28();
		mySimpleTest28.printCount();
		
		SimpleTest28.printCount();
	}

}
