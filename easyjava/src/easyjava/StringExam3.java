package easyjava;

public class StringExam3 {

	public static void main(String[] args) {
		String sStr = "Java Programmer";
		
		String sSubStr = sStr.replaceAll("Java", "C#");
		String[] sSubStr2 = sStr.split(" ");
		
		System.out.println("sSubStr = "+ sSubStr);
		System.out.println("sSubStr2[0] = "+ sSubStr2[0]);
		System.out.println("sSubStr2[1] = "+ sSubStr2[1]);
		
		if(sStr.startsWith("java")) {
			System.out.println("Java로 시작");
		} else {
			System.out.println("Java로 시작아님");
		}
		
		//sSubStr = C# Programmer
		//sSubStr2[0] = Java
		//sSubStr2[1] = Programmer
		//Java로 시작아님
	}
}
