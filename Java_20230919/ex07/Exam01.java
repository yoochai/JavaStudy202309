package ex07;

import java.util.Random;


//썩기
public class Exam01 {

	public static void main(String[] args) {
		
		int[] numA = new int[10];
		
		for(int i=0; i<numA.length; i++)
			numA[i] = i+1;
		
		System.out.println("원 데이타 : ");
		for(int i=0; i<numA.length; i++)
			System.out.print(numA[i] + " ");
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); //0~9
			int tmp = numA[0];
			numA[0] = numA[n];
			numA[n] = tmp;
		}
		
		System.out.println("\n썩은 데이타 : ");
		for(int i=0; i<numA.length; i++)
			System.out.print(numA[i] + " ");
	}
	
	 
}









