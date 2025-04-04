package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class Server2 {
	
	private static final int PORT = 12345;
	private static Set<PrintWriter> clientWriters = new HashSet<>();

	public static void main(String[] args) {
		System.out.println("서버 시작");
		try (ServerSocket serverSocket = new ServerSocket(111)) {
		while (true) {
			new ClientHandler(serverSocket.accept()).start();
		}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	private static class ClientHandler extends Thread {
		private Socket socket;
		private PrintWriter out;
		private BufferedReader in;
		
		
		
		public ClientHandler(Socket socket) {
			// do something
			this.socket = socket;
			
			
		}
		public void run() {}
			try {
				in = new BufferedReader(new InputStreamReader(socket.getIn));
				out = new PrintWriter(socket.getOutputStream());
				
				
				/**
				 * 여러 스레드가 동시에 특정 메스드나 블럭을 실행할때
				 * 경쟁 조건 방지하기위해 쓴다.
				 * 하나의 스레드가 synchronized 선언된 메서드를
				 * 실행하는 동안 다른 스레드가 메서드나 블럭을 실행못하게 막는다.
				 * 
				 */
				synchronized (clientWriters) {
					clientWriters.add(out);
						
				}
				String message;
				while ((message = in.readLine()) != null) {
					System.out.println("받은 메시지 : " + message);
						for (PrintWriter writer : clientWriters) {
							writer.println(message);
						}
				}
				
				
			}
			
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		socket.close();
	}
}
