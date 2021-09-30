package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte b[]=new byte[100];
		
		try {
			//입력 스트림에서 지정된 byte 수 만큼 읽어오기
			while(in.read(b)!=-1) {
				out.write(b);				
			}
			
		} catch (IOException e) {		
			e.printStackTrace();
		} finally { //무조건 실행(exception 이 발생하던 발생하지 않던)
			try {
				in.close();
				out.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		

	}
}











