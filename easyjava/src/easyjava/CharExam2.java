package easyjava;

public class CharExam2 {

	public static void main(String[] args) {
		char c1 = 'C';
		char c2 = 67; // 아스키코드
		char c3 = '\u0043'; // u:유니코드, 0043:16진수 C
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		//아스키(ASCII) 코드는 언어에 상관없이 모두 사용이 가능합니다. 위의 설명대로 숫자로 이루어져있기 때문에 C, Java, Python, HTML 등등 언어에 상관없이 아스키 코드를 알고 있으면 종종 개발할때 많은 도움이 되기도 합니다.
		//아스키코드는 128개의 숫자를 사용한다고 하였는데, 개발을 할때 늘 그렇듯이 시작은 항상 0 입니다. 그렇기 때문에 0 ~ 127 까지 사용할수 있다고 보면 됩니다.
	}
}
