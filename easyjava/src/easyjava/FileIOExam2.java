package easyjava;

import java.io.File;

public class FileIOExam2 {

	public static void main(String[] args) {
		File oFile = new File("C:" + File.separator + "test2.txt");
		
		try {
			if(oFile.exists()) {
				System.out.println("파일존재");
			} else {
				System.out.println("파일미존재");
				
				if(oFile.createNewFile()) {
					System.out.println("파일생성 성공");
				} else {
					System.out.println("파일생성 실패");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
}
