package ex02_6;

class Box<T>{
	private T ob;		
	public void set(T ob) {	this.ob = ob; }
	public T get() { return this.ob; }
	
	@Override
	public String toString() { return ob.toString(); }
}

class Toy{
	public String toString() { return "I am a Toy";	}
}

class BoxContentMover{
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
		to.set(from.get());
//		form.set(to.get());
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		
		Box<Toy> box1 = new Box<>();
		box1.set(new Toy());
		
		Box<Toy> box2 = new Box<>();
		
		//box1에 저장된 내용을 box2로 이동
		BoxContentMover.moveBox(box2,box1);
		System.out.println(box2.get());
		
	}
}