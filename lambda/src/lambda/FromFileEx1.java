package lambda;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FromFileEx1 {

	public static void main(String[] args) {
		//data.txt
		Path path = Paths.get("src/lambda/data.txt");
		
		try {
			Files.lines(path,Charset.defaultCharset()).forEach(s->System.out.println(s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
