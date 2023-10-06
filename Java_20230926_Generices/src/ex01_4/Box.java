package ex01_4;

public class Box<T> {
		//필드
		private T t;
		
		//Getter메소드
		public T get() {
			return t;
		}
		//Setter메소드
		public void set(T t) {
			this.t = t;
		}
}
