package easyjava;

import java.util.Hashtable;

public class HashTableExam {

	public static void main(String[] args) {
		Hashtable<String, String> myHashTable = new Hashtable<String, String>();
		myHashTable.put("01012345678", "홍길동");
		myHashTable.put("01045674321", "김개똥");
		myHashTable.put("01054221232", "아무개");
		
		String sPhoneNum = myHashTable.get("01012345678");
		System.out.println("첫번째 값 = " + sPhoneNum);
		
		String sPhoneNum2 = myHashTable.get("01012345671");
		System.out.println("두번째 값 = " + sPhoneNum2);
		
		int nHashSize = myHashTable.size();
		System.out.println("크기 = " + nHashSize);
		
		//첫번째 값 = 홍길동
		//두번째 값 = null
		//크기 = 3
	}
}
