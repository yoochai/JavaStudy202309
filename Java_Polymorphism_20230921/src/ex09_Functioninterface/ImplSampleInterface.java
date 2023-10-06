package ex09_Functioninterface;

public class ImplSampleInterface implements SampleInterface{

	@Override
	public void sample() {
		System.out.println("이놈은 무조건 구현해야한다");
	}
	
	public void sample2() {
		System.out.println("니가 선택해서 구현하거나 말거나 선택이다");
	}

	

}
