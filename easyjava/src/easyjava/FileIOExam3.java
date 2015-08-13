package easyjava;

import java.io.File;

public class FileIOExam3 {

	public static void main(String[] args) {
		File oFile = new File("C:" + File.separator + "text.txt");
		
		if(oFile.exists()) {
			long nFileSize = oFile.length();
			System.out.println("파일크기 = "+nFileSize);
			
			System.out.println("파일경로 = "+oFile.getAbsoluteFile());
			 
		} 
		 
		
		/*
		
		File.separator - "\"		//디렉토리 구분자
		File.pathSeparator - ";"	//패스 구분자
		
		
		파일 상태관련 메서드
		
		canExecute()
		canRead() - 읽기 가능한 상태 여부
		canWrite() - 쓰기 가능한 상태 여부
		isAbsolute() - 절대경로 여부
		isDirectory() - 디렉토리 여부
		isFile() - 파일 여부
		isHidden() - 숨김상태 여부
		equals(Object obj)
		exists() - 디렉토리 및 파일의 존재여부 확인


		createNewFile() - 파일생성(성공여부 boolean)
		delete() - 디렉토리와 파일삭제, 폴더 삭제시에는 가장 하위 디렉토리만 삭제 가능
		deleteOnExit() - delete()와 기능은 동일하나 프로그램 종료시 삭제가 진행
		mkdir() - 하나의 디렉토리만 생성
		mkdirs() - 경로 중간에 디렉토리가 없는경우 최종 디렉토리와 함께 중간 디렉토리들도 생성
		renameTo(File dest) - 폴더명나 파일이름을 변경
		createTempFile(String prefix, String suffix, File directory) - 임시파일로 생성
		compareTo(File pathname) - 파일비교


		getName() - 파일 또는 디렉토리 이름 반환
		getPath() - 경로 반환
		getAbsoluteFile() / getAbsolutePath() - 절대경로 반환
		getCanoniaclFile() / getCanonicalPath() - 정규경로 반환
		getParentFile() / getParent() - 상위 디렉토리 반환, 없는 경우 null 반환
		getTotalSpace() - 파티션 전체 용량
		getFreeSpace() - 파티션 남은 용량
		getUsableSpace() - 가상머신에서 사용가능한 전체용량
		length() - 파일 용량
		lastModified() - 마지막 수정 시간
		list() - 파일 및 디렉토리 문자열 배열 반환
		listFiles() - 파일 및 디렉토리 File 객체 배열 반환
		File.listRoots() - 루트목록을 File배열로 반환
		*/
	}
}
