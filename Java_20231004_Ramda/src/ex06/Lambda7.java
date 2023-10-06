package ex06;

interface Square{
	int square(int x);
}

class sqqqq implements Square{

	@Override
	public int square(int x) {
		return x * x ;
	}
	
}

public class Lambda7 {	
	public static void main(String[] args) {
		
		Square sq = x -> x * x;
		
		int aa = sq.square(5);
		System.out.println(aa);
		
			
			
		};
	}
