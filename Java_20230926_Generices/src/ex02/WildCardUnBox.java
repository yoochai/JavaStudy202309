package ex02;

class Box<T>{
	private T ob;		
	public void set(T ob) {	this.ob = ob; }
	public T get() { return this.ob; }
	
	@Override
	public String toString() { return ob.toString(); }
}

class Unboxer{
	//제네릭 메소드
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
	
	//와일드 카드 메소드
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		
		Box<String> box = new Box<>();
		box.set("So Simple String...");
		
		Unboxer.peekBox(box);
		
		String str = Unboxer.openBox(box);
		System.out.println("openBox : " + str);
	}
}
