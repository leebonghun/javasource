package exam;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar c = Calendar.getInstance();
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		default:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("���� ����\t"+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� ���ϴ�");
		}else {
			System.out.println("������ �ڹ� �����մϴ�");
		}
	}

}
