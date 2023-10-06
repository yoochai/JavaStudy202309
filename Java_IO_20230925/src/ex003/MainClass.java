package ex003;

class A{
	private int age;
	private String name;
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
}


class B extends A{
	private String address;
	
	B(String name, int age, String address){
		super(name, age);
		this.address=address;
	}
	
	public void info() {
		System.out.println(address);
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		A b = new B("조조", 30, "장안구");
		b.info();
	}

}
