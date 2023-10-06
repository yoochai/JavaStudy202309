package ex08_01;

public class OracleDao extends DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색2");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입2");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정2");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제2");
	}

}
