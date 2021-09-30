package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss�� E���� ");
		
		System.out.println(sdf.format(date));
		
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);

		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);

		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
	}

}
