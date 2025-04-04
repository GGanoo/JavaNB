package main;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamBasic03 {

	public static void main(String[] args) throws IOException {
		
		// 파일을 읽는 
		FileInputStream input = new FileInputStream("c:/java/out.txt");
		byte[] b = new byte[1024];
		input.read(b);
		System.out.println(new String(b));
		input.close();
		
		
	}

}
