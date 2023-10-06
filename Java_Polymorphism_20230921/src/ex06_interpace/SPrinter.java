package ex06_interpace;

public class SPrinter implements CSPrinter{

//	override 상위클래스에있는것을 재정의하겠다.
	@Override	//어노테이션(@)	명시의 역할
	public void print(String msg) {
		System.out.print("삼성 프린터 흑백 출력 : ");
		System.out.println(msg);
	}

	@Override
	public void cprint(String msg) {
		System.out.print("삼성 프린터 칼라 출력 : ");
		System.out.println(msg);
	}
	
}