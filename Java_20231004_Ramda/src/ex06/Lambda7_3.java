package ex06;

import java.util.function.BiFunction;
import java.util.function.Function;

// Function<T, R> 	T -> R 	R apply(T t)
public class Lambda7_3 {	
	public static void main(String[] args) {
		
		Function<Integer, Double> f1 = x -> x*x*1.0;
		
		double d1 = f1.apply(9);
		System.out.println(d1);
		
		
		Function<Integer, Double> f2 = x -> x*x*1.0;
		System.out.println(f2.apply(7));
		
		// 람다식
		Function<String, Integer> f3= (String s) -> Integer.parseInt(s);
		int result = f3.apply("100");
		System.out.println(result);
		
		// 메소드참조
		System.out.println("--------------------------");
		Function<String, Integer> f4= Integer::parseInt;
		result = f4.apply("100");
		System.out.println(result);
		};
	}
