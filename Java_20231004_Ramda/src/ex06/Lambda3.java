package ex06;

interface Printable3{
	void print(String msg);
}

public class Lambda3 {	
	public static void main(String[] args) {
		Printable3 prn = 
				
				(msg) -> System.out.println(msg);
		
		prn.print("msg print3");
	}
}
