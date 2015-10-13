package easyjava;

public class FloatExam2 {
	public static void main(String[] args) {
		float f;
		//f= 2.5; // 컴파일 오류발생(double 형으로 인식)
		f = (float)2.5; // 명시적 형변환
		
		System.out.println("f = "+ f);
	}
}
