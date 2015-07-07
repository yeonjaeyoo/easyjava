package easyjava;

import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> myVector = new Vector<String>();
		
		myVector.add("김개똥");
		myVector.add("홍길동");
		myVector.add("아무개");
		
		int nVectorSize = myVector.size();
		System.out.println("크기 = " + nVectorSize);
		
		for(int i=0;i<nVectorSize;i++) {
			String sName = myVector.get(i);
			System.out.println("인덱스="+i);
			System.out.println("값="+sName);
		}
	}

}
