package ex02_2;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an orange";
	}
}

// 제네릭 클래스
class Box<T>{	
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj(){
		return obj;
	}
}


public class Generices1 {
	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>();
		aBox.setObj(new Apple());
		
		Box<Orange> oBox = new Box<Orange>();
		oBox.setObj(new Orange());
		
		Orange or = oBox.getObj();
		System.out.println(or);
	}
}
