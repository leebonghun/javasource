package interfaceTest;

public class Oracle implements DataAccessObject {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("오라클 디비에서 삽입");
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("오라클 디비에서 선택");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("오라클 디비에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("오라클 디비에서 삭제");
	}
}
