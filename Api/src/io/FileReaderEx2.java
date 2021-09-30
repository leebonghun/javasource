package io;

import java.io.FileReader;
import java.io.Reader;

/* 처리할 파일이 문자라면 , Reader,Writer 가 편하다
 * char 형태로 처리
 * 
 * 
 * 
 */

public class FileReaderEx2 {
	public static void main(String[] args) {
		try(Reader reader = new FileReader("c:\\bong123\\file1.txt")) {
			char[] cbuf = new char[100];			
			
			int readcharNo;
			
			while((readcharNo=reader.read(cbuf))!= -1) {
				String data = new String(cbuf,0,readcharNo);
				System.out.println(data);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
