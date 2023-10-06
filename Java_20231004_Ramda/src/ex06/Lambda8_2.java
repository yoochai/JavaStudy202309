package ex06;

import java.util.function.Supplier;

//  Supplier	() -> T	T get()
public class Lambda8_2 {	
	public static void main(String[] args) {
		
		Supplier<Integer> s1 = ()-> (int)(Math.random()*6);
		
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = new Supplier<Integer>() {

			@Override
			public Integer get() {
				return (int)(Math.random()*6);
			}
			
		};
		System.out.println(s2.get());
	}
}
