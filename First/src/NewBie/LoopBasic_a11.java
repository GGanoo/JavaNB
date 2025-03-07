package NewBie;

public class LoopBasic_a11 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌다.
		// 눈이 합이 6이 되는 모든경우의 수를 출력
		// 1 + 5, 2+ 4, 3+3, 4+2, 5+1
		
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
		
				if( (i + j)==6 )
					
					
					// %d ===> 정수
					// %s ===> 문자
					// %f ===> 소수점
					// %n ===> 엔터(줄바꿈)
					System.out.printf("%d + %d = %d %n", i ,j , i+j);
					//	System.out.println(i + " + " + j + " = " + (i + j)); 
				
		
		
			}	
			}
		
			}

}
