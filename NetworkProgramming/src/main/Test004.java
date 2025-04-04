package main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

class IOService{
	private byte[] bytes(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public void output1() {
		
		
		
		try 
			{
			FileWriter fos = new FileWriter("C:\\java\\test.txt", true);
			
			
			String str = "안녕하세요!";
			
			
			
			for( int i = 0; i < str.length(); i++) {
				fos.write(str.charAt(i));
				
			}
			fos.close();
			
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			
				}
			}
		
}

public class Test004 {



		public static void main(String[] args)throws FileNotFoundException {
			IOService service = new IOService();
			service.output1();
			System.out.println("완료");
		}
	}

		

