package ClassTest;

import javax.naming.spi.DirStateFactory.Result;

public class Circle {
	//원의면적 : 반지름 * 반지름  * 3.14
	
	//속성 : 반지름
//	   기능 : 면적을 구한다
	
	double jirum;
	
	double mun() {
		
		return jirum * jirum * 3.14;
	}
}
