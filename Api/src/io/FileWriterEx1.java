package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter writer = new FileWriter(new File("c:\\bong123\\file1.txt"),true)) {
			
			writer.write("FileWriter�� ���ڿ��� �ٷ�\r\n");
			writer.write("����� �� �ֽ��ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
	}
	}
}
