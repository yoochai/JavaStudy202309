package ex01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws IOException {

		
		OutputStream os = new FileOutputStream("c:/data/test2.db");
		
		byte[] array = {10,20,30,40,50};
		
		os.write(array);
		os.flush();	// 버퍼 클리어
		os.close();
	}

}
