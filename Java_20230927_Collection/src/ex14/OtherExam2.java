package ex14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class OtherExam2 {

	public static void main(String[] args) {
		
		int[] ar = {1,7,3,7,8,9,10,2,4};
		
		for(int i : ar)
			System.out.print(i+ " ");
		System.out.println();
		System.out.println();
		
		Arrays.sort(ar);
		for(int i : ar)		// 순서대로 출력
			System.out.print(i+ " ");
		System.out.println();
		System.out.println();
		
		String[] str = {"Box", "Toy", "toy", "Robot", "box", "robot"};
		Arrays.sort(str);	// 순서대로 출력(String일 경우 아스키 코드값 기준)
		for(String i : str)
			System.out.print(i + " ");
	}
}