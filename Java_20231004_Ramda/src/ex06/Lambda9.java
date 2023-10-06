package ex06;

interface Arr{
	int sumArr(int[] arr);
}

class ssss implements Arr{

	@Override
	public int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum+=i;
		return sum;
	}
	
}

public class Lambda9 {	
	public static void main(String[] args) {
		Arr ar = 
			(int[] arr) -> {	
				int sum = 0;
				for(int i : arr)
					sum += i;
				return sum;
			};
		
		
		int[] qqq = {1,2,3,4,5};		
		int result = ar.sumArr(qqq);
//		int result = ar.sumArr(new int[] {1,2,3,4,5});	29,30줄을 합친말
		System.out.println(result);
			
	}
}
