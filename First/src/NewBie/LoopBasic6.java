package NewBie;

public class LoopBasic6 {

	public static void main(String[] args) {
		int coffee = 10;
		int money = 300;
		int count=0;
		while (money > 0) { //coffee < 0 로 바뀌면 break;를 입력 안해도됨.
			
			System.out.println("돈을 받았다. 커피를 준다.");
			System.out.println("현 금액 " + (money * ++count) );
			System.out.println("남은 커피의 양은 " + --coffee + "입니다.");
			if (coffee == 0) {
				System.out.println("커피 판매 종료");
				break;
			}
			
			
		}
	}

}
