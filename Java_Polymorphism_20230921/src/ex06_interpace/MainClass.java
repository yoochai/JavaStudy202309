package ex06_interpace;

public class MainClass {

	public static void main(String[] args) {
		Printable prn = new LPrinter();
		String msg = "hello world";
		prn.print(msg);
		
		prn = new SPrinter();
		prn.print(msg);
		
		CSPrinter p = new SPrinter();
		p.cprint(msg);	// 칼라 출력
		p.print(msg);	// 흑백 출력
		
		Printable p2 = new SPrinter();
		p2.print(msg);
//		p2.cprint(msg);	// Sprinter로 접근했기떄문에 CSPrinter접근불가
	}

}
