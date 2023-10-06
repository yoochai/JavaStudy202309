package ex03;

class Printeraa{
	private boolean isHelloTurn = true;
	
	synchronized public void printHello() {
		while(!isHelloTurn) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hello");
		isHelloTurn = false;
		notify();
	}
	
	synchronized public void printWorld() {
		while(!isHelloTurn) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("World");
		isHelloTurn = true;
		notify();
	}
}
public class CurrentThreadName8 {


	public static void main(String[] args) throws InterruptedException {
		Printeraa printer = new Printeraa();
		
		Thread t1 = new Thread(() -> {
			for(int i=0; i<10; i++) {
				printer.printHello();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for(int i=0; i<10; i++) {
				printer.printWorld();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	
	}

}
