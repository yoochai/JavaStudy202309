package ex01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample4 {

	public static void main(String[] args) throws IOException {

		
		Reader reader = new FileReader("c:/data/test4.txt");
		char[] data = new char[100];
		
		while(true) {
			int num = reader.read(data);
			if(num == -1) break;
			
			for(int i=0; i<num; i++)
				System.out.print(data[i]);

			System.out.println("\n----------------------------------");
		}
		reader.close();
	}

}
