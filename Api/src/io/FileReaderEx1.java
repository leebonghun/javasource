package io;

import java.io.FileReader;
import java.io.Reader;

/* ó���� ������ ���ڶ�� , Reader,Writer �� ���ϴ�
 * char ���·� ó��
 * 
 * 
 * 
 */

public class FileReaderEx1 {
	public static void main(String[] args) {
		try(Reader reader = new FileReader("c:\\bong123\\file1.txt")) {
			char[] cbuf = new char[100];			
			
			int readcharNo;
			
			while((readcharNo=reader.read(cbuf))!= -1) {
				System.out.println(cbuf);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
