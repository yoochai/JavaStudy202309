package ex06_interpace;

public class LPrinter implements Printable{

	@Override	//어노테이션(@)	명시의 역할
	public void print(String msg) {
		System.out.print("LG 프린터 흑백 출력 : ");
		System.out.println(msg);
	}
}
