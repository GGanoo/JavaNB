package NewBie;

public class LoopBasic5 {

	public static void main(String[] args) {
		
		
		// 반복문 : for, while , do ~ while
		
		for (int i = 0; i < 10; i++) {
			
		}
		
		
		int treeHit = 0;
		while (treeHit < 10) {
			// 수행할 문장
			
			System.out.println("나무를 " + ++treeHit + "번 찍었습니다.");
			
			if (treeHit == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
			
			
			
		}
	}

}
