package ex06;

public class MainClass {

	public static void main(String[] args) {
		
		A a = new A();
		a.funcA();
		
		B b = new B();
		b.funcB();
		b.funcA();
//		b.funcC(); 	(X 불가능)
		
		C c = new C();
		c.funcC();
		c.funcB();
		c.funcA();
		
		System.out.println("====================");
		
		A aa = new B();	// A에만 진입 가능
		aa.funcA();	// A 클래스의 funcA()출력
		
		B bb = (B)aa;
		
		A a3 = new C();
		
		C c3 = (C)a3;
		
		B b3 = (C)a3;	// C클래스에 접근 불가 B,A만 가능
		b3.funcB();
		b3.funcA();
//		b3.funcC();	// 불가능		C b3 = (C)a3일 경우 가능
		
		
		
		//B클래스가 A클래스 있는 funcA메소드를 재정의 하면 그 때는 B클래스 안 funcA가 실행됨
	}

}
