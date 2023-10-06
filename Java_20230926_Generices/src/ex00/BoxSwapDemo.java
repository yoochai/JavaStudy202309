package ex00;

class Box<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}
/*
 * swapBox메소드를 정의 하되, Box<T> 인스턴스를 인자로 전달받을 수 있도록 정의한다
 * 단 이때 Box<T>인스턴스의 T는 Number또는 이를 상속하는 하위 클래스만 올 수 있도록 제한된 매개변수 선언 한다
 * */


public class BoxSwapDemo {

	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		box1.set(99);
		Box<Integer> box2 = new Box<>();
		box2.set(55);
		System.out.println(box1.get() + "&" + box2.get()); //99&55
		swapBox(box1, box2);
		
		System.out.println(box1.get() + "&" + box2.get()); //55&99

	}

	public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
	}

}