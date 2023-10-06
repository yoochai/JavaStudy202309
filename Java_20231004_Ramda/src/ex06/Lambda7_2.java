package ex06;

import java.util.function.BiFunction;
import java.util.function.Function;

// int square(int x)

// int add(int x, int y)
// int sub(int x, int y)
public class Lambda7_2 {	
	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = x -> x*x;
		
		System.out.println(f1.apply(5));
		
		
		System.out.println("----------------");
		BiFunction<Integer, Integer, Double> bif1 = (x, y) -> (x+y)*2.0;
		System.out.println(bif1.apply(10, 10));
		
		System.out.println("-----------------");
		BiFunction<Integer, Integer, Integer> bif2 = (x,y) -> x-y;
		System.out.println(bif2.apply(20, 19));
		
		};
	}
