package easyjava;

/**
 * @author educar
 *
 */
interface Test1 {
	public void printTest1();
}

interface Test2 {
	public void printTest2();
}

public class SimpleTest23 implements Test1, Test2 {
	public void printTest1() {
		System.out.println("Test1 Print");
	}
	
	public void printTest2() {
		System.out.println("Test2 Print");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleTest23 st23 = new SimpleTest23();
		System.out.println("인터페이스 상속시 정의된 모든 추상 메소드를 구현해야 한다.");
		st23.printTest1();
		st23.printTest2();
		
	}
}
