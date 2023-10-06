package ex02_1;

class Box<T>{
	private T ob;		
	public void set(T ob) {	this.ob = ob; }
	public T get() { return this.ob; }
	
	@Override
	public String toString() { return ob.toString(); }
}

class Unboxer{
	//와일드 카드 메소드				// 하한 제한(super) 상한제한(extends)	integer < number < object
	public static void peekBox(Box<? extends Object> box) {
		System.out.println(box);
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box<>();
		iBox.set(9999);
		
		Box<Number> nBox = new Box();
		nBox.set(10.3);
		
		Box<Object> bBox = new Box();
		bBox.set("Simple");
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(nBox);
		Unboxer.peekBox(bBox);
		
	}
}
