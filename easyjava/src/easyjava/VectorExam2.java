package easyjava;

import java.util.Vector;

public class VectorExam2 {

	public static void main(String[] args) {
		Vector<String> myVector = new Vector<String>();
		myVector.add("JAVA");
		myVector.add("C");
		myVector.add("RUBY");
		
		int nVectorSize = myVector.size();
		System.out.println("ũ�� = " + nVectorSize);
		for(int i = 0; i < nVectorSize; i++) {
			System.out.println("�ε���=" + i + " ��=" + myVector.get(i));
		}
		
		myVector.remove(1);
		System.out.println("\n1��° �ε���  ����");
		
		nVectorSize = myVector.size();
		for(int i = 0; i < nVectorSize; i++) {
			System.out.println("�ε���=" + i + " ��=" + myVector.get(i));
		}
		
		myVector.remove("JAVA");
		System.out.println("\nJAVA ����");
		
		nVectorSize = myVector.size();
		for(int i = 0; i < nVectorSize; i++) {
			System.out.println("�ε���=" + i + " ��=" + myVector.get(i));
		}
	}
}
