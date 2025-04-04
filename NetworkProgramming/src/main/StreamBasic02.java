package main;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class StreamBasic02 {

	public static void main(String[] args) {
		
		try (PrintWriter write = new PrintWriter("c:/java/1aa.txt")) {
		
			String value = "InputStream 은 바이트 단위로 데이터를 처리한다.";
			
			for (int i = 0; i < 31 ; i++) { 
				String data = i + "번째 줄 입니다.\r\n";
				write.write(value.charAt(i));
						System.out.println(i);
			}
			write.close();
					
		
			write.close();
		}catch (Exception e) {
			
		}
		
		
		
	}

}
