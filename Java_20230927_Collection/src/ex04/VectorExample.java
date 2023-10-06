package ex04;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {

		List<String> list = new Vector<String>();
		
		list.add("페르시안");
		list.add(null);
		list.add(1,"샴");	// 1번자리에 샴을 삽입한다
		
		for(String s : list)
		System.out.println(s);
		
		
	}

}
