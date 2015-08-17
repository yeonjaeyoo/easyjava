package easyjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOExam5 {

	public static void main(String[] args) {
		try {
			String sBr = "";
			
			FileReader fr = new FileReader("C:" + File.separator + "test.txt");
	        BufferedReader br = new BufferedReader(fr);
	        
	        FileWriter fw = new FileWriter("C:" + File.separator + "test2.txt", true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        
	        while((sBr = br.readLine()) != null) {
	            bw.write(sBr);
	        }
	        
	        if(br != null)
	        	br.close();
	        
	        if(fr != null)
	        	fr.close();
	        
	        if(bw != null)
	        	bw.close();
	        
	        if(fw != null)
	        	fw.close();
	    } catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
	    	e.printStackTrace();
		} catch(Exception e) {
			System.out.println("기타 오류입니다.");
			e.printStackTrace();
		}
	}
	
	/*
	
	버퍼스트림(Buffered Stream)이란 기본 입출력스트림에 버퍼기능을 추가하는 스트림을 의미한다. 즉, 입력된 데이터가 바로 프로그램으로 전달되지 않고 중간에 버퍼링이 된 후에 전달된다는 의미이다. 출력도 마찬가지로 버퍼를 거쳐서 간접적으로 출력장치로 전달된다.
         중간버퍼를 사용함으로써 시스템의 데이터처리 효율성을 높여준다.
         버퍼스트림은 이미 생성된 바이트스트림이나 문자스트림에 연결하여 사용한다.
        기본스트림에 비해서 프로그래밍에서는 줄단위 문자열(String) 처리가 가능하다는 편리함이 있다

	주요메소드 

	BufferedReader(Reader rd) : rd에 연결되는 문자입력 버퍼스트림 생성
	﻿BufferedWriter(Writer wt) : wt에 연결되는 문자출력 버퍼스트림 생성​
	int read() :  스트림으로부터 한 문자를 읽어서 int 형으로 리턴
	int read(char[] buf) : 문자배열 buf의 크기만큼 문자를 읽어들임.  읽어들인 문자 수를 리턴
	int read(char[] buf, int offset, int length) : buf의 offset위치에서부터 length 길이만큼 문자를 스트림으로부터 읽어들임​
	String readLine() : 스트림으로부터 한 줄을 읽어 문자열로 리턴​​
	void mark()  : 현재우치를 마킹, 차 후 reset() 을 이용하여 마킹위치부터 시작함.
	void reset() : 마킹이 있으면 그 위치에서부터 다시시각, 그렇지 않으면 처음부터 다시시작
	long skip(int n) : n 개의 문자를 건너 뜀
	void close() : 스트림 닫음
	void write(int c) :  int 형으로 문자 데이터를 출력문자스트림으로 출력
	void write(String s, int offset, int length) :  문자열 s를 offset 위치부터 length 길이만큼을 출력스트림으로 출력
	void write(char[] buf, int offset, int length) :  문자배열 buf의 offset 위치부터 length 길이만큼을 출력스트림으로 출력​​​
	void newLine() : 줄바꿈 문자열 출력
	void flush() : 남아있는 데이터를 모두 출력시킴.

	*/
}
