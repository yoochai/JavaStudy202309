package ex10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class TreeSetExam {

	public static void main(String[] args) {
		Set<Integer> tree = new TreeSet<Integer>();
		
		tree.add(3);
		tree.add(2);
		tree.add(5);
		tree.add(5);
		tree.add(10);
		tree.add(10);
		tree.add(7);
		tree.add(4);
		tree.add(9);
		
		for( int num : tree)
			System.out.println(num);
	}
}