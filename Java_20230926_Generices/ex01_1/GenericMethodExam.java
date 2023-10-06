package ex01_1;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() { return this.ob; }
}

class UnBoxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}

public class GenericMethodExam {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Sweet");
		
		
		String str = UnBoxer.openBox(box);		// T : String
		System.out.println(str);
	}
}
