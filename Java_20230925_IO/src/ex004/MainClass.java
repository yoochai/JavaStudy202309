package ex004;

abstract class R {
	abstract void funcA() ;
	
}
class A extends R{
	void funcA(){
		System.out.println("AAA");
	}
}

class B extends R{
	void funcA(){
		System.out.println("BBB");
	}
}

class C extends R{
	void funcA(){
		System.out.println("CCC");
	}
}

class D {
	void funcA(){
		System.out.println("DDD");
	}
}

public class MainClass {

	public static void main(String[] args) {		
		conver(new B());
	}
	
	static void conver(Object obj) {
		if( obj instanceof R) {
			R a = (R)obj;
			a.funcA();
		}
		System.out.println("conver");	// 되는지 확인용 위랑 관련없음
	}
}
