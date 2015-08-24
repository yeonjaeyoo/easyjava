package easyjava;

public class StringExam2 {

	public static void main(String[] args) {
		String sStr = "Java Programmer";
		
		String sSubStr = sStr.substring(0, 4);
		String sSubStr2 = sStr.toLowerCase();
		String sSubStr3 = sStr.toUpperCase();
		
		System.out.println("sSubStr = "+ sSubStr);
		System.out.println("sSubStr2 = "+ sSubStr2);
		System.out.println("sSubStr3 = "+ sSubStr3);
		
		//sSubStr = Java
		//sSubStr2 = java programmer
		//sSubStr3 = JAVA PROGRAMMER
	}
}
