package easyjava;

public class OneChild extends OneParent {
	public OneChild() {
		System.out.println("자식 생성자.");
	}
	
	public void getAddress() {
		System.out.println("서울");
	}
	public static void main(String[] args) {
		OneChild myOneChild = new OneChild();
		
		myOneChild.getLastName();
		myOneChild.getAddress();
	}

}
