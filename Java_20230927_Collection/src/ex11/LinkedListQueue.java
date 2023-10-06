package ex11;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.LinkedTransferQueue;

import javax.management.Query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class LinkedListQueue {

	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
		Queue<String> queue = new LinkedTransferQueue<String>();
		
		queue.add("Toy1");
		queue.offer("Box1");
		queue.offer("Robot1");
		queue.offer("Toy2");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("---------------------");
		for(String s : queue)
			System.out.println(s);
		
		System.out.println("======================");
		for(String s : queue)
			System.out.println(s);
		System.out.println("/////////////////////////");
		
		System.out.println(queue.peek());
		
		System.out.println("********************");
		for(String s : queue)
			System.out.println(s);
	}
}