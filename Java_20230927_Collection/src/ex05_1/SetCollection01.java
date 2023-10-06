package ex05_1;

import java.util.*;


class Person{
	public Person() {
		System.out.println("----------------------");
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode...........");
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals...........");
		return super.equals(obj);
	}
}
public class SetCollection01 {

	public static void main(String[] args) {

//		List<String> list = new LinkedList<String>();
		Set<Person> list = new HashSet();
		
		list.add(new Person());
		list.add(new Person());
		list.add(new Person());
		list.add(new Person());
		
		}
	}
