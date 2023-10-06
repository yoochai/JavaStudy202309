package ex01;

import java.util.*;

public class ArrayList01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i = 0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("-----------------------");
		
		for(String s : list)
			System.out.println(s);
		
		list.remove(0);		//0번자리에 있는 Toy 삭제 >> Box는 0번자리에 Robot은 1번자리에 안착
		System.out.println("----------------------");
		for(String s : list)
			System.out.println(s);
		
		list.add(1, "Toy");	// 1번 자리에 삽입
		System.out.println("----------------------");
		for(String s : list)
			System.out.println(s);
		
	}

}
