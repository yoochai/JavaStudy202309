package ex02;


//재귀 호출
public class Exam01 {

	public static void main(String[] args) {
		
		System.out.println(add(1,3));
		
		System.out.println(add(1,3,5));
		
		System.out.printf("%.2f\n",add(1.8, 3.9, 5.9));
		
	}
	
	static int add(int n1, int n2) {
		return n1+n2;
	}

	static int add(int n1, int n2,int n3) {
		return n1+n2+n3;
	}

	static double add(double n1, double n2,double n3) {
		return (n1+n2+n3);
	}
	

}









