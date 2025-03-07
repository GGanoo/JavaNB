class Calculator { 
	// a, b 매개변수
//	 int sum(int a, int b) {
//		 return a + b;  // 연산결과를 되돌려준다.

	 // 매서드의 구조
	 // 리턴자료형 메서드명(sum) 입력자료형1 매개변수1 입력자료형2 매개변수2, ............
	 // return 리턴값;  // 연산 할 필요없다면 사용안함
	 // 리턴할 자료가 없으면 return 문이 필요 없다.
	 // 이경우에는 리턴자료형을 void 로 한다.

// 입력과 출력이 모두 있는 메서드
	int sum (int a, int b) {
		return a + b;
	}
// 입력과 출력이 모두 없는 메서드
	String say () {
		return "HI";
	}
// 입력은 없고 출력은 있는 메서드
	void sum2(int a, int b) {
		System.out.println(a + "와" + b + "의 합은 " + (a + b) + "입니다.");
	}
	// 객체.메서드명 (파라미터1, 파라미터2,.....)
// 입력은 있고 출력이 없는 메서드
	void say2() {
		System.out.println("HI");
	}
	void sayNick(String nick) {
		if ("바보".equals(nick)) {
			return;
		}
		//System.out.println("나의 별명은 " + nick + "입니다.");
		System.out.printf("나의 별명은 %s 입니다.", nick);
	}
	public void sayNick2(String nick) {
		sayNick(nick);
	}
}
	
public class SampleCalss_02 {

	public static void main(String[] args) {
		
		
			// 계산기 1번 객체를 생성한다.
			Calculator cal1 = new Calculator();
			// 계산기 2번 객체를 생성한다.
			Calculator cal2 = new Calculator();
			String hi = cal1.say();

			// 3, 4 인수
			int result = cal1.sum(3, 4);
			System.out.println(result);
			String 감자 = cal1.say();
			System.out.println(감자);
			cal1.sum2(3, 4);
			cal1.say2();
			
			
			cal1.sayNick2("바보");
			
			
			
	}

}
