package ex07_pleasejava1;

public class SoundalbeExample {

	public static void printSound(Soundalbe soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
		
	}

}
