package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

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
		public ClientHandler(Socket socket) {
			// do something
			
		}
		public void run() {}
		
		
	}
}
