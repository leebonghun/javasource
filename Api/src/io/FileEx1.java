package io;

import java.io.File;

/* File
 * 파일을 다루기 위한 클래스
 * 폴더(디렉토리) : / , \
 * 
 * \t, \n, \b....
 */

public class FileEx1 {
	public static void main(String[] args) {
		File file1 = new File("c:\\temp\\test1.txt");
		File file2 = new File("c:\\temp","test1.txt");
		
		File file3 = new File("c:\\temp");
		File file4 = new File(file3, "test1.txt");		
		// File file4 = new File(new File("c:\\temp"), "test1.txt");		

	}
}
