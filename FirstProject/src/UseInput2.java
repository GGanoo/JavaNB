import java.util.Scanner;

public class UseInput2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 1번 입력 : ");
		int in = scanner.nextInt();
		System.out.println("숫자 2번 입력 : ");
		int in2 = scanner.nextInt();
		System.out.println("연산 기호 입력 : ");
		String operator = scanner.next();
		int result = 0;
		if (operator.equals ("+")) {
			result =  in + in2;
		}else if (operator.equals ("-")) {
			result =  in + in2;
		}else if (operator.equals ("*")) {
			result =  in + in2;
		}else if (operator.equals ("/")) {
			
		}
		
		
		System.out.println((in + in2));
		// 숫자 2개를 입력 받아서 덧샘 연산 후 출력
		// + - * / 문자열로 받아
		// in = 5 in2 = 10 연산기호 /
		// 2
		
		// int, float, double, char, boolean
		// primitive 원시 자료형
		// String wrapper class
		
		
	}

}
