package easyjava;

public class OneChild extends OneParent {
	public OneChild() {
		System.out.println("�ڽ� ������.");
	}
	
	public void getAddress() {
		System.out.println("����");
	}
	public static void main(String[] args) {
		OneChild myOneChild = new OneChild();
		
		myOneChild.getLastName();
		myOneChild.getAddress();
	}

}
