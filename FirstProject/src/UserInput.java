import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// 자동완성은 ctrl + space 
		// 자동완성 목록이 나오면 방향키 상,하 + 엔터를
		// 이용해서 완성가능
	//	Scanner scanner =  new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String str = scanner.next();
		System.out.println(str + "님 반가워요.");
		// 김건우
		// 김건우님 반가워요.
		// 사용자에게 문자형태로 입력을 받는다.
	//	int in  = scanner.nextInt();
		// 사용자에게 숫자만 입력받는다.
	}

}
