package ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("c:/data/test3.txt");
			
			char a = 'A';
			writer.write(a);
			char B = 'B';
			writer.write(B);
			char C = 'C';
			writer.write(C);
			
			//배열 출력
			char[] arr = {'D','E','F','G'};
			writer.write(arr);
			
			//문자열 저장
			String str = "HIJ";
			writer.write(str);
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
