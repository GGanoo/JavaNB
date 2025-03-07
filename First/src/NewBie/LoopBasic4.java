package NewBie;

public class LoopBasic4 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 5; i++) {
			if (i == 3) {
				
				continue;  // 반복문 종료는 break;
			}			// 반복문의 현재 단계 종료 continue;
			System.out.println(i);
		}
	}

}
