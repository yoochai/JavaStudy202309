package ex06;

import java.util.Random;

public class Exam01 {

	public static void main(String[] args) {
		 getNum(6);
	}
	
	 public static int getRandomNum() {
	      int value;
	      Random rand = new Random();
	      value = rand.nextInt(10);
	      //System.out.println(value);
	      return value;
	   }
	   
	   public static void getNum(int userInput) {
	      int[] arr = new int[userInput];
	      int temp;

	      for (int i = 0; i < userInput; i++) {
	         temp = getRandomNum();
	         if (i != 0) {
	            for (int j = 0; j < i ; j++) {
	               if (arr[j] == temp) {
	                  i = i - 1;
	                  System.out.println("중복값 발생");
	                  break;
	               } else {
	                  arr[i] = temp;
	               }
	            }
	         } else {
	            arr[i] = temp;
	         }
	      }
	      
	      for (int i = 0; i < userInput; i++) {
	         System.out.println(arr[i]);
	      }
	   }

}









