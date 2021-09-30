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
		} finally { //������ ����(exception �� �߻��ϴ� �߻����� �ʴ�)
			try {
				in.close();
				out.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		

	}
}











