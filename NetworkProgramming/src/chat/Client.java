package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		/**
		 * 1. 서버와 연결 (IP + 포트번호)
		 * 2. 서버와 데이터 송수신을 위한 스트림 설정
		 * 3. 서버로 메시지 전송
		 * 4. 서버로 응답 수신
		 * 5. 연결 종료
		 */
		
		
		try {
			// localHost 또는 127.0.0.1
			Socket socket = new Socket("localhost", 12345);
			
			// 서버와 데이터 송수신을 위한 스트림 설정
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			// 서버로 보내는 메시지
			out.println("반갑다.");
			
			// 서버에서 응답 수신
			String response = in.readLine();
			System.out.println("서버로부터 받은 메시지 : " + response);
			
			// 연결 종료
			socket.close();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 로컬 호스트에 상대 아이피 입력하면 해당 아이피로 
		
		
		
	}

}
