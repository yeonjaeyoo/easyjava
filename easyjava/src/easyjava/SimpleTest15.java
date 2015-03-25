/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest15 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sNum;
		sNum = "-10.3";
		
		String[] sSplitNum = sNum.split("[.]");
		System.out.println("정수="+sSplitNum[0]);
		System.out.println("정수="+sSplitNum[0].substring(0, 1));
		System.out.println("정수="+sSplitNum[0].substring(1));
		System.out.println("소수="+sSplitNum[1]);
	}
}
