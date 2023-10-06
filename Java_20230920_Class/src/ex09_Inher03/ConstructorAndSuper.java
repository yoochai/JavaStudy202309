package ex09_Inher03;
//기본생성자 만들기
	
class Car{	// 기본 연료 자동차
	int gasolineGauge;
	public Car(int gasolineGauge) {
		this.gasolineGauge = gasolineGauge;
	}
}

class HybridCar extends Car{	// 하이브리드 자동차
	int electricGauge;
	public HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar{	// 하이브리드 워터카
	int waterGuage;
	public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGuage) {
		super(gasolineGauge,electricGauge);
		this.waterGuage = waterGuage;
	}

	public void showCurrentGauge(){
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGuage);
	}
}

class ConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hwCar1 = new HybridWaterCar(4, 2, 3);
		hwCar1.showCurrentGauge();
		
		System.out.println("====================");

		HybridWaterCar hwCar2 = new HybridWaterCar(9, 5, 7);
		hwCar2.showCurrentGauge();
	}

}
