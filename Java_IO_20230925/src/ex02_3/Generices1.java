package ex02_3;

class A{}
class B extends A{}
class C extends B{}


// 제네릭 클래스
class Box<T extends A>{ 	
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
		
		Box<A> aBox = new Box();
		Box<B> bBox = new Box();
		Box<C> cBox = new Box();
		
		ArrayList<Integer> ilist = new ArrayList();
	}
}
