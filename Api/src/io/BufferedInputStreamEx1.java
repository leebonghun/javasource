package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			
			 fis = new FileInputStream("c:\\bong123\\file1.txt");
			 bis = new BufferedInputStream(fis);
			 fos = new FileOutputStream("c:\\bong123\\file2.txt");
			 bos = new BufferedOutputStream(fos);
			
			
			int data;
			while((data=bis.read())!= -1) {
				bos.write(data);
			}
			bos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				fis.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	}

}
