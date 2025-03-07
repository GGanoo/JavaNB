// 클래스 블록
public class HelloWorld {
	// 메서드 블록 (method) , 파라미터 (parameter)"안녕"
	public static void main(String[] args) {
		// 명령문 (명령문은 ;로 마무리 한다)
/*		System.out.println("Hello World");
		
		System.out.print("Hello World"); */
		
		
		// 자료형 int, 변수(변하는 수/ 변수의 시작은 항상 소문자로 쓰여야함) a
		// 변수명은 자유롭게 선언 할 수 있지만
		// 숫자 또는 특수문자로 시작하면 안된다
		// int : 자료형
		// a : 변수명
		// = 대입연산자
		// 1 : 변수값
		// ; : 명령문 종료
		int a = 1;
		// b 변수를 만들고 2를 대입해라.
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		//  기본자료형 : primitive type
		//  int : 메모리에 4 byte 공간을 차지한다.
		// 문자  : String
		String s = "asdasd";
		
		// c 3, d 5
		int c = 3;
		int d = 5;
		
		System.out.println(c + d);
		System.out.println(c - d);
		System.out.println(c * d);
		System.out.println(c / d);
		
		// 변수이름 짓는 규칙
		// 카멜 케이스
		// jong sun choi
		String jongSunChoi = "최종선";  //대문자,소문자로 낙타 등 처럼 굴곡져 보이는
	
		// 언더스코어 케이스
		String jong_sun_choi = "최종선";  // 띄어쓰기 대신 _ 를 붙인다
		
		String g = "최";
		String h = "종선";
		int i = 100;
		System.out.println(g + h + i);
		
		
		
		
		// 실수 (소숫점)
		// float, double
	}

}
