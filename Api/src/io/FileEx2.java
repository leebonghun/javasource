package io;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\InputStreamEx1.java");
		
		//파일 이름
		String fileName = file.getName();
		// . 위치
		int pos=fileName.lastIndexOf(".");
		
		System.out.println("파일명 : "+fileName);
		System.out.println("확장자를 제외한 파일명 : "+fileName.substring(0, pos));
		System.out.println("확장자 : "+fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일명 : "+file.getPath());
		System.out.println("파일이 속해 있는 폴더명 : "+file.getParent());
		
		System.out.println("File.separator : "+File.separator);
		System.out.println("File.pathSeparator : "+File.pathSeparator);

	}
}














