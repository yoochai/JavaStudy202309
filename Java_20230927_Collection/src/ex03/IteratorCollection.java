package ex03;

import java.util.*;

public class IteratorCollection {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		for(String s : list)
			System.out.printf(s+ " ");
		
		
		Iterator<String> itr = list.iterator();	// 반복자 획득
		
		String str;
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("Box"))
				itr.remove();
			System.out.println(str);
			
		}
		System.out.println("------------------");
		itr = list.iterator();	// 반복자 획득 (안적으면 아래 문장이 실행이 안됨)
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
			
		}
		
	}

}
