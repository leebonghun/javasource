package lambda;

import java.io.File;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamEx6 {

	public static void main(String[] args) {
		// 중간연산 : 자르기(skip,limit) , 걸러내기 (filter,distinct), 정렬(sorted), 변환(map)
		//		   조회(peek)
		
		// File 객체 stream으로 만들어내고 싶다면~ 
		
		Stream<File> stream1 = Stream.of(new File("file1.txt"),new File("file2.txt"),new File("file3.txt"),new File("test.java")
										,new File("Ex1"),new File("ex2.bak"));
		
		//파일의 확장자 출력하기
		

		stream1.map(File::getName).filter(f -> f.lastIndexOf(".") > -1).map(f -> f.substring(f.lastIndexOf(".")+1))
								  .distinct().forEach(System.out::println);
	}

}
