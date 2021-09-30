package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		try {
			int input = in.read();
			out.write(input);
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











