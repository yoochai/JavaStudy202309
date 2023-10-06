package ex09_Inher;

public class SmartPhone extends Phone{

	public boolean wifi;
	
	public SmartPhone(String model, String color, boolean wifi){
		
		super(model,color);	// super > 상위 클래스 호출
		this.wifi = wifi;	// this > 같은 클래스 내 호출
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void youTube() {
		System.out.println("유튜브에 접속한다");
	}
	
}
