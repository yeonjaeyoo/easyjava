package easyjava;

public class TwoConstructor {
	private int k;
	public TwoConstructor(int i) {
		this.k = i;
		System.out.println("생성자 호출="+k);
	}
	
	public TwoConstructor() {
		this(3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoConstructor myTwoConstructor1 = new TwoConstructor();
		TwoConstructor myTwoConstructor2 = new TwoConstructor(5);
	}
}
