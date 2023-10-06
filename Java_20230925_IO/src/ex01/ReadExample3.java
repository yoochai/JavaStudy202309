package ex01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("c:/data/test3.txt");
		
		while(true) {
			int read = reader.read();
			if(read == -1) break;
			System.out.print((char)read);	//(char)붙이면 문자로 출력
		}
		reader.close();
		
		System.out.println("\n----------------------------------");
		
		reader = new FileReader("c:/data/test3.txt");
		char[] data = new char[100];
		
		while(true) {
			int num = reader.read(data);
			if(num == -1) break;
			
			for(int i=0; i<num; i++)
				System.out.print(data[i]);
		}
		reader.close();
	}

}
