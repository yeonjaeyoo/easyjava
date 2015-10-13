package easyjava;

public class ShortAddExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sNum1 = 2;
		short sNum2 = 4;
		short sNum3;
		
		int iNum;
		
		iNum = sNum1 + sNum2;
		sNum3 = (short)(sNum1 + sNum2);
		
		System.out.println("결과1=" + iNum);
		System.out.println("결과2=" + sNum3);
		
		// 자료형 byte와 short 산술연산은, 연산이 실행되기 전에 모두 int형으로 변환되고 난 다음에 연산이 진행된다.
		// 연산에 참여하게 되면 모두 int형으로 형변환되므로 계산결과는 int형이 된다.  
	}
}
