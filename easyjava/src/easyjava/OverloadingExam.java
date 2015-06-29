package easyjava;

public class OverloadingExam {
	public void print() {
		System.out.println("매개변수 없음.");
	}
	
	public void print(int k) {
		System.out.println("int k = " + k);
	}
	
	public void print(String name, int k) {
		System.out.println("String name = "+name);
		System.out.println("int k = " + k);
	}
	
	public static void main(String[] args) {
		OverloadingExam myOverLoad = new OverloadingExam();
		myOverLoad.print();
		myOverLoad.print(3);
		myOverLoad.print("java", 5);
	}
}
