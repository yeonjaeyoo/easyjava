/**
 * 
 */
package easyjava;

/**
 * @author educar
 *
 */
public class SimpleTest10 {
	// 생성자
	public SimpleTest10() {
		System.out.println("생성자 예제.");
	}
	
	// 생성자
	public SimpleTest10(String str) {
		System.out.println(str + "생성자 예제.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleTest10 st1 = new SimpleTest10();
		SimpleTest10 st2 = new SimpleTest10("첫번째 파라미터");
		System.out.println("언제 실행?");
	}

}
