package ex01;

public class TV {
	
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
	
}
