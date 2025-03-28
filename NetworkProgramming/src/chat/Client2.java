package chat;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client2 {

	private static final String SERVER_ADDRESS = "localhost";
	private static final int SEVER_PORT = 12345;
	private static Socket socket;
	private static PrintWriter out;
	private static BufferedReader in;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("채팅 프로그램");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea chatArea = JTextArea();	//읽기 전용이여야함
		chatArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(chatArea);
		
		JTextField inputField = new JTextField();
		JButton sendButton = new JButton("보내기");
		
		sendButton.addActionListener(e -> senMessage());
		
		frame.setLayout(new BorderLayout());
		JPanel panel = new JPanel(new BorderLayout(inputField.getText(), chatArea));
		panel.add(scroll, BorderLayout.CENTER);
		panel.add(inputField, BorderLayout.SOUTH);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(sendButton);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(buttonPanel), BorderLayout.SOUTH);
		
		frame.setVisible(true);
		
		try {
			socket = new Socket()(SERVER_ADDRESS, SERVER_PORT);
			out = new PrintWriter(socket,getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String message;
			while ((message = in.readLine()) != null) {
				chatArea.append("서버: " + message + "\r\n;");
				
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
		private static void sendMessage(String message, JTextArea chatArea)
		if (message.isEmpty()) return;
		out.println(message);
		chArea.append("나 : " + message + "\r\n");
}
