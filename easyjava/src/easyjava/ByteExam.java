package easyjava;

public class ByteExam {

	public static void main(String[] args) {
		byte b = 100;
		
		System.out.println("b = " + 100);
		System.out.println("byte의 래퍼클래스를 이용한 최소/최대값 보여주기");
		System.out.println("byte 최소값 = " + Byte.MIN_VALUE);
		System.out.println("byte 최대값 = " + Byte.MAX_VALUE);
		
		//b = 100
		//byte의 래퍼클래스를 이용한 최소/최대값 보여주기
		//byte 최소값 = -128
		//byte 최대값 = 127
	}
}
