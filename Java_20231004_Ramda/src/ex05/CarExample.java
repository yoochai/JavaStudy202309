package ex05;


public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1();
		
		car.run2();
		
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("하위 클래스 객체 생성");
			}
		});
		
		car.run3(new aa());
	}

}
