package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		
		Worker worker = new Worker();
		Employee e1 = new Employee();
		e1.setName("ȫ�浿");
		e1.setPosition("���");
		worker.work(e1);
		
		Ceo ceo = new Ceo();
		
		ceo.setName("�ں���");
		ceo.setPosition("����");
		worker.work(ceo);
		
		Manager manager = new Manager();
		
		manager.setName("�̺���");
		manager.setPosition("�Ŵ���");
		worker.work(manager);
		
		PartTime part = new PartTime();
		part.setName("������");
		part.setPosition("�˹ٻ�");
		worker.work(part);
		
	}

}
