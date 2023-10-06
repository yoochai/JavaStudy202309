package ex06;

import java.util.function.Function;

//Function<T, R>	T -> R	R apply(T t)

/*
  class ssss implements Arr{

	@Override
	public int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum+=i;
		return sum;
	}
	
}
*/



public class Lambda9_2 {	
	public static void main(String[] args) {
		Function<Integer[], Integer> f1 = new Function<Integer[], Integer>() {
			
			@Override
			public Integer apply(Integer[] arr) {
				int sum = 0;
				for(int i : arr)
					sum+=i;
				return sum;
			}
		};
		int result = f1.apply(new Integer[] {10,20,30,40,50});
		System.out.println(result);

		
		Function<Integer[], Integer> f2 = arr -> {
													int sum = 0;
													for(int i : arr)
														sum+=i;
													return sum;
		};
		result = f2.apply(new Integer[] {1,2,3,4,5});
		System.out.println(result);

	}
}
