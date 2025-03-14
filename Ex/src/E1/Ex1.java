package E1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//		2~9 사이 정수를 입력될 때 까지 무한 반복하다가, 2~9 사이 정수가 입력되면 해당하는 단의 구구단을 출력하고 종료하는 소스코드를 작성하였다. 
//		하지만 오류도 발생하고, 의도에 맞지 않게 동작하는 문제도 발생했다.
//		문제와 소스코드를 분석하여 모든 문제 원인(문제점+문제 발생 원인), 조치내용(해결방법  + 수정된 코드)을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2 ~ 9 사이 정수 입력 :");
			
			int input = sc.nextInt(); 														//int input = sc.next(); 
			
			
			
			if(input <= 9 && input >= 2) {													//if(input <= 9) { 2~9 정수만 입력시 출력되게
				for(int num = 1 ; num <= 9 ; num++) {
					System.out.printf("%d * %d = %d\n" , input, num, input * num);			// System.out.printf("%d * %d = %d\n" , input, num);
				}																			// input 과  num 의 곱의 합을 미입력함
				break;																		// 종료문 미개입
			}else {
				System.out.println("2이상 9이하의 정수만 입력해주세요.");
			}
		}
	}
}
