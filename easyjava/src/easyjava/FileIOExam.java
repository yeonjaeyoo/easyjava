package easyjava;

import java.io.File;

public class FileIOExam {

	public static void main(String[] args) {
		File oFile = new File("C://text.txt");
		
		if(oFile.exists()) {
			System.out.println("파일존재.");
		} else {
			System.out.println("파일미존재");
		}
	}
}
