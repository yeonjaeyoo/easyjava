package easyjava;

public class OverrindingExam {

	public static void main(String[] args) {
		OverridngParent myParent = new OverridngParent(); 
		OverridngChild myChild = new OverridngChild();
		
		myParent.getAge();
		myParent.getName();
		
		myChild.getAge();
		myChild.getName();
	}
}
