package ex03;

public class CurrentThreadName {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		
		String name = thread.getName();
		System.out.println("스레드 이름 : "+ name);

	}

}
