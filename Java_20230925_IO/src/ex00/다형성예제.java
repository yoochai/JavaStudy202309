package ex00;
class A{
	void funcA() {System.out.println("funcA...");}
}

class B extends A{
	void funcB() {System.out.println("funcB...");}
	void funcA() {System.out.println("funcBA...");}
}

class C extends B{
	void funcC() {System.out.println("funcB...");}
	void funcA() {System.out.println("funcCA...");}
}
public class 다형성예제 {

	public static void main(String[] args) {
		
		A a = new A();
		a.funcA();
		
		A a3 = new C();
		a3.funcA();
		
	}

}
