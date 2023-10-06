package ex03;


public class CurrentThreadName6 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread (() -> {
			for(int i=0; i<5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread (() -> {
			for(int i=0; i<5; i++) {
				System.out.println("World");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	
	}

}