package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FirstStreamExam {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		
		IntStream stm1 = Arrays.stream(ar);
		IntStream stm2 = stm1.filter(n->n%2==1);	// 1,3,5 통과
		int sum = stm2.sum();
		System.out.println(sum);
		
		int result = Arrays.stream(ar).filter(n->n%2==0).sum();		// 필터로 2,4 통과 후 sum
		System.out.println(result);

		System.out.println("--------------------------------");
		String[] names = {"Toy","BB","Box","CCCC","Robot","AAAA"};
	
//		Arrays.stream(names).forEach(s->System.out.println(s));
		
		//글자수가 3보다 큰데 홀수인 글자를 출력해라
		Arrays.stream(names).filter(s-> s.length()>3).filter(s->s.length()%2==1).forEach(s->System.out.println(s));	
		
		List<String> list = Arrays.stream(names).filter(s->s.length()>3).filter(s->s.length()%2==1).toList();
		System.out.println("List : " + list);
		
		System.out.println("-------------------------------------");
		Arrays.stream(names).map(s->s.length()).forEach(s->System.out.println(s));
		
		
		System.out.println("-------------------------------------");
		int sum2 = Arrays.stream(names).mapToInt(s->s.length()).sum();
		System.out.println(sum2);
		
		System.out.println("-------------------------------------");
		List<String> str = Arrays.asList("Toy","BB","Box","CCCC","Robot","AAAA");
		
		int sum3 = str.stream().mapToInt(s->s.length()).sum();
		System.out.println(sum3);
		
	}

}
