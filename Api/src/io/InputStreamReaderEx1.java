package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(InputStreamReader reader = new InputStreamReader(new FileInputStream("c:\\bong123\\file1.txt"),"ms949");
				FileWriter writer = new FileWriter("c:\\bong123\\file2.txt")) {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
