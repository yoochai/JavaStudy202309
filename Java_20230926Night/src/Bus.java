
public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 갑니다");
	}
	public void checkFare() {
		System.out.println("승차 요금을 내세요");
	}
}
