package calc;
 

import java.awt.BorderLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

 

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JTextField;

 

// ActionListener는 사용자의 인터렉션 감지

public class ccc extends JFrame implements ActionListener {

 

	private JPanel panel; // numberInput의 패널

	private JPanel panel2; // otherInput의 패널

	private GridLayout gridLayout; // 계산기 버튼을 담을 레이아웃

	private JButton btns;

	private JTextField numberInput; // 숫자입력

	private JTextField otherInput; // 연산기호입력

	private String[] strGrid = {"7","8","9","/","4","5","6","*","1","2","3","-" ,"0","C","+","="};

 

	// 연산자 목록

	private static final List<String> 연산자리스트 = Arrays.asList("+", "-", "*", "/");

 

	// 숫자 누적 배열

	ArrayList<Integer> 숫자배열 = new ArrayList<>();

	// 연산자 누적 배열

	ArrayList<String> 연산자배열 = new ArrayList<>();

	// 숫자 누적 값

	private String 숫자누적 = "";

	// 결과값 

	private String 결과값 = "";

 

	public ccc() {

		// 제목 설정

		super("계산기");

		// 프레임 크기 지정

		this.setSize(300, 400);

 

		// 버튼을 담기 위한 객체

		this.panel = new JPanel();

		this.panel2 = new JPanel();

		this.numberInput = new JTextField("0");

		this.otherInput = new JTextField("");

		// 텍스트의 우측 정렬

		this.numberInput.setHorizontalAlignment(JTextField.RIGHT);

		this.otherInput.setHorizontalAlignment(JTextField.RIGHT);

		// 입력 못하게 처리

		this.numberInput.setEditable(false);

		this.otherInput.setEditable(false);

 

		this.panel2.setLayout(new BorderLayout());

		this.panel2.add(BorderLayout.NORTH, this.numberInput);

		this.panel2.add(BorderLayout.CENTER, this.otherInput);

 

		// 배열을 순회하면서 버튼 삽입

		for(int i=0; i<strGrid.length; i++){

			this.btns = new JButton(strGrid[i]);

			// 버튼 누름을 감지한다. 누르면 actionPerformed 메서드가 실행된다.

			this.btns.addActionListener(this);

			this.panel.add(this.btns);

		}

 

		// 버튼을 담은 panel을 GridLayout에 담는다.

		this.panel.setLayout(new GridLayout(4,4,6,6));

		this.add(BorderLayout.CENTER,panel);

		this.add(BorderLayout.NORTH, panel2);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

 

	public static void main(String[] args) {

		new ccc();

	}

 

	@Override

	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();

		System.out.println(cmd);

		// 숫자를 입력했는지 연산기호를 입력했는지 판단

		// C버튼 (초기화) 눌렀을때, = 버튼 눌렀을때

		if (cmd.equals("C")) {

			// ArrayList 초기화

			숫자배열.clear();

			연산자배열.clear();

			// 연산 변수 초기화

			숫자누적 = "";

			결과값 = "";

			// 인풋박스 값 초기화

			this.numberInput.setText("0");

			this.otherInput.setText("");

		} else if (cmd.equals("=")) {

			// =을 눌렀을때 최종 연산

			if (!숫자배열.isEmpty()) {

				// 배열의 마지막에 숫자 추가

				숫자배열.add(Integer.parseInt(숫자누적));

			}

			int sum = 숫자배열.get(0);

			for (int i = 0; i < 연산자배열.size(); i++) {

				String 연산자 = 연산자배열.get(i);

				int 숫자 = 숫자배열.get(i + 1);

				switch (연산자) {

					case "+":

						sum += 숫자;

						break;

					case "-":

						sum -= 숫자;

						break;

					case "*":

						sum *= 숫자;

						break;

					case "/":

						try {

							sum /= 숫자;

						} catch (ArithmeticException ex) {

							sum = 0;

						}

						break;

				}

				// 계산 결과를 String으로 형 변환 후 인풋 박스에 출력

				this.numberInput.setText(Integer.toString(sum));

				this.otherInput.setText("");

				숫자배열.clear();

				연산자배열.clear();

				숫자누적 = "";

			}

		} else {

			// 숫자 또는 연산 기호의 처리

			if (연산자리스트.contains(cmd)) {

				// 사칙연산 1234 + 

				// 숫자누적에 값이 있으면 숫자 배열에 형변환 후 추가한다.

				if (!숫자누적.isEmpty()) {

					숫자배열.add(Integer.parseInt(숫자누적));

					숫자누적 = "";

				}

				연산자배열.add(cmd);

				this.otherInput.setText(cmd);

 

				System.out.println(숫자배열.toString());

				System.out.println(연산자배열.toString());

 

			} else {

				// 숫자버튼 처리

				if (숫자누적.equals("0")) {

					숫자누적 = cmd;

				} else {

					숫자누적 += cmd;

				}

				this.numberInput.setText(숫자누적);

			}

		}

	}

 

}

 