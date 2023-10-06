package ex01_3;

class Box<T>{
	private T ob;	// String ob
	
	public Box( T ob) {
		this.ob=ob;
	}
	
	public void set(T ob) {	// set(String ob)
		this.ob = ob;
	}
	public T get() { 
		return this.ob; 
	}	// String ob
}

class SteelBox<T> extends Box<T>{
	public SteelBox(T ob) {
		super(ob);
	}
}
public class GenericMethodExam {

	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox(new Integer (9999));
		Box<String> sBox = new SteelBox(new String("Sweet"));
		Box<String> sBox2 = new SteelBox(new Integer("9999"));	// Integer를 String으로 받을수없다(타입이 같아야한다)
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
		System.out.println(sBox2.get());
	}
}
