package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class StreamBasic04 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader("c:/java/out.txt"));
		
		
		
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			System.out.println(line);
		}
		br.close();

}
}