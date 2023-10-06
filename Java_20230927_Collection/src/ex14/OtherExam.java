package ex14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class OtherExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list = {10, 20, 30, 40, 50};		불가능
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		int[] intNum = new int[5];
		int[] intNum2 = {10, 20, 30, 40, 50};
		
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40, 50);
		
		for(int i : list2)
			System.out.print(i+ " ");
		System.out.println();
		
		List<String> list3 = Arrays.asList("Toy", "Box", "Robot");
		for(String i : list3)
			System.out.print(i+ " ");
		
		System.out.println();
//		list3.add("Box");		사용불가	Arrays.asList 추가 안됨
		
//		List<String> list4 = Arrays.asList("Toy", "Box", "Robot");
		
		List<String> list5 = new ArrayList(Arrays.asList("Toy", "Box", "Robot") );
		list5.add("Box");
		list5.add("Robot");
		
		for(String s : list5)
			System.out.println(s+ " ");
	}
}