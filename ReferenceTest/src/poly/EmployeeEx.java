package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setPosition("사원");
		worker.work(e1);
		
		Ceo ceo = new Ceo();
		
		ceo.setName("박보검");
		ceo.setPosition("사장");
		worker.work(ceo);
		
		Manager manager = new Manager();
		
		manager.setName("이봉훈");
		manager.setPosition("매니저");
		worker.work(manager);
		
		PartTime part = new PartTime();
		part.setName("정욱진");
		part.setPosition("알바생");
		worker.work(part);
		
	}

}
