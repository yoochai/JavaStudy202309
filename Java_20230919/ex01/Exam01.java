package ex01;


//재귀 호출
public class Exam01 {

	public static void main(String[] args) {
		
		int result = factorial(5);
		
		System.out.println("result : " + result);

	}
	
	static int factorial(int num) {
		int result = 0;
		
		if(num == 1)
			return 1;
		else
			result = num * factorial(num-1);
		
		return result;
		
	}

}









