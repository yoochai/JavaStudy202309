package ex10;

public class 대학동창 extends 사람{
	String 전공;

	public 대학동창(String 이름,int 나이,String 전공) {
		super(이름, 나이);
		this.전공 = 전공;
	}
	public void 사람info() {
		super.사람info();
		System.out.println(전공);
	}
	
	
	
}