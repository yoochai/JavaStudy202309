package ex06;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//	void printVar(String name);
//  System.out.println(name);


public class Lambda6_2 {	
	public static void main(String[] args) {
//		Consumer<String> con = name -> System.out.println(name);
		Consumer<String> con = new Consumer<String>() {
			
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		};
		
		con.accept("gg");
		
		BiConsumer<String, Integer> bicon = (name, i) -> System.out.println(name + " = " + i);
		bicon.accept("조조", 24);

	}
}
