package ex09_Inher;

public class PhoneExam01 {

	public static void main(String[] args) {
		
		Phone p = new Phone("applephone", "black");
		p.bell();
		p.sendVoice("테스트 입니다");
		p.hangUp();
		
		SmartPhone s = new SmartPhone("samsung", "white", true);
	}
	
}
