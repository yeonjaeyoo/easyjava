package easyjava;

public class StringExam4 {

	public static void main(String[] args) {
		String sStr = "Java Programmer";
		String sStr2 = " ";
		
		if(sStr.isEmpty()) {
			System.out.println("sStr is empty.");
		} else {
			System.out.println("sStr is not empty.");
		}
		
		if(sStr2.isEmpty()) {
			System.out.println("sStr2 is empty.");
		} else {
			System.out.println("sStr2 is not empty.");
		}
		
		if(sStr2.trim().isEmpty()) {
			System.out.println("sStr2(trim) is empty.");
		} else {
			System.out.println("sStr2(trim) is not empty.");
		}
	}
}
