package interfaceTest;

public class MySql implements DataAccessObject {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("mysql 디비에서 삽입");
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("mysql 디비에서 선택");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("mysql 디비에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("mysql 디비에서 삭제");
	}
}
