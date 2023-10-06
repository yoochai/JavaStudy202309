package ex01_2;

class Box<T>{
	private T ob;	// String ob
	public void set(T ob) {	// set(String ob)
		this.ob = ob;
	}
	public T get() { return this.ob; }	// String ob
}

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("unBoxed data : " + box.get().intValue());
		return box.get();
	}
}

public class GenericMethodExam {

	public static void main(String[] args) {
//		Box<Integer> sBox = BoxFactory.<Integer>makeBox(new Integer(9898)); 아래와 같은말
//		Box<Integer> sBox = BoxFactory.makeBox(new Integer(9898)); 아래와 같은말
		Box<Integer> sBox = BoxFactory.makeBox(9898);
		int n = Unboxer.openBox(sBox);
		System.out.println(n);
	}
}
