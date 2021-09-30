package interfaceTest;

public class DaoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new Oracle());
		dbWork(new MySql());
	}
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
