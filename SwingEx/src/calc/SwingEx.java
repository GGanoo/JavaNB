package calc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
// 상속 받아서 구현하면 new JFrame() 메서드 안써도 된다.
public class SwingEx extends JFrame {
	// 창을 만드는 객체
	// 파라미터를 지정하면 제목이 출력된다.
	//JFrame frame = new JFrame("계산기");
	// 버튼 객체
	JButton btn1 = new JButton("확인");
	JButton btn2 = new JButton("취소");
	JButton btn3 = new JButton("1");
	JButton btn4 = new JButton("2");
	JButton btn5 = new JButton("3");
	
	JPanel jpanel = new JPanel();
	
	
	
	public SwingEx() {
		// 제목 설정
		super("계산기");
		// 프레임 크기 지정
		this.setSize(300, 400);
		
		this.setLayout(new GridLayout(3, 2));
		
		this.setLayout(new BorderLayout());
		
//		jpanel.add(btn1);
//		jpanel.add(btn2);
		this.add(jpanel, " North");
//		this.add(btn3, "West");
//		this.add(btn4, "Center");
		
		JTextField text = new JTextField("0");
		// 사용자가 직접 입력하지 못하게 막는다.
		text.setEditable(false);
		// 텍스트 우측 정렬
		text.setHorizontalAlignment(JTextField.RIGHT);
		//텍스트 필드를 상단에 배치한다.
		this.add(BorderLayout.NORTH, text);
		
		
		
		/**
		 *  GridLayout(세로 몇줄, 가로 몇줄)
		 */
		//컴포넌트를 담을 컨테이너 설정
		Container container = this.getContentPane();
		container.add(btn1);
		container.add(btn2);
		container.add(btn3);
		container.add(btn4);
		container.add(btn5);
//		container.add(btn1, BorderLayout.NORTH);
//		container.add(btn2, BorderLayout.EAST);
//		container.add(btn3, BorderLayout.WEST);
//		container.add(btn4, BorderLayout.SOUTH);
//		container.add(btn5, BorderLayout.CENTER);
		/**
		 * 레이아웃 설정
		 * 1. FlowLayout : 컴포넌트를 좌에서 우로 배치 + 중앙정렬
		 * 2. BorderLayout : 배치 위치를 정할 수 있다. 동서남북 + 중앙
		 * 3. GridLayout : 테이블 형태의 레이아웃
		 */
		//this.setLayout(new FlowLayout());
		
		
		//버튼 추가
//		this.add(btn1);
//		this.add(btn2);
//		this.add(btn3);
//		this.add(btn4);
//		this.add(btn5);
		
		
		// 프레임 보이기 
		this.setVisible(true);
		// 닫기 버튼 클릭시 처리
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		/**
		 * 용어
		 * 1. Container : 컴포넌트를 담는 역할
		 * 2. Component : 버튼, 인풋박스,텍스트 에어리어 등
		 * 3. Layout : 컨테이너를 담는다. 화면에 자리 배치
		 */
		// 창 띄우기
		//SwingEx swingEx = new SwingEx();
		new SwingEx();
		
		
		
	}

}
