package ex00;

class Vehicle{
	private String name;
	
	public Vehicle(String car) {
		this.name = car;
	}
	public String getName() {
		return "이차의 이름은 : "+ name;
	}
	
}

class Car extends Vehicle{
	
	public Car(String car) {
		super(car);
	}
	
	public String getName(String val) {
		return "Car name : " + val;
	}
	
	public String getName(byte val[]) {
		return "Car name : " + val;
	}
}

public class Edulwill {

	public static void main(String[] args) {
		Car obj = new Car("Spark");
		
		System.out.println(obj.getName());

	}

}
