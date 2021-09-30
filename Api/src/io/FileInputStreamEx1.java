package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {
		InputStream in=null;
		OutputStream out = System.out;
		
		byte[] datas = new byte[100];
		try {
			 in = new FileInputStream("c:\\bong123\\file1.txt");
			 
			 while(in.read(datas)!=-1) {
				 out.write(datas);
			 }			 
		} catch (FileNotFoundException  e) {			
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	}
}













