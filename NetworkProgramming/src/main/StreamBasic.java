package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamBasic {

	public static void main(String[] args) throws IOException {
		// byte로 읽는다.
		InputStream in = System.in;
		// char로 읽는다.
		InputStreamReader reader = new InputStreamReader(in);
		// String으로 읽는다.
		BufferedReader br = new BufferedReader(reader);
		//입력값은 ACSII 코드 값 출력
		String a = br.readLine();
		System.out.println(a);
		
				
				
	}

}
