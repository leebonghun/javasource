package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter writer = new FileWriter(new File("c:\\bong123\\file1.txt"),true)) {
			
			writer.write("FileWriter는 문자열을 바로\r\n");
			writer.write("출력할 수 있습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
	}
	}
}
