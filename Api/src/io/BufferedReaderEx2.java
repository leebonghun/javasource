package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr = new FileReader("src/io/BufferedInputStreamEx5.java");
				BufferedReader br = new BufferedReader(fr);) {
			
			char cbuf[] = new char[100];
			
			String line = "";
			fr.read(cbuf);
			int i=1;
			while((line = br.readLine())!=null) {
				System.out.println(i+" "+line);
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
