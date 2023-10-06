package ex06;

@FunctionalInterface	// 인터페이스 안에 추상메서드 1개만 존재하게
interface Cal{
	int max(int num1, int num2);
}

// 람다식은 추상메서드가 1개만 있을때 사용가능
public class Lambda4 {	
	public static void main(String[] args) {
		Cal cal = 
				(num1, num2) -> num1 > num2 ? num1 : num2;
		
		int result = cal.max(5, 10);
        System.out.println(result);
	}
}
