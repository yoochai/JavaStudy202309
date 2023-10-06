package ex06;

import java.util.function.Predicate;


public class Lambda10 {	
	public static void main(String[] args) {		
		
		Predicate<Integer> pp = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer x) {
				System.out.print(x + " : ");
				return x%2==0;
			}
		};
		
		boolean flag = pp.test((int)(Math.random()*100));
		
		String msg = flag == true? "짝수" : "홀수" ;
		
		System.out.println(msg);
		
		System.out.println("-------------------");
		
		Predicate<Integer> p1 = x -> {
				System.out.print(x + " : ");
				return x%2==0;
		};
		
		flag = p1.test((int)(Math.random()*100));
		
		String msg1 = flag == true? "짝수" : "홀수" ;
		
		System.out.println(msg1);
	}
}
