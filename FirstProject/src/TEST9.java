
public class TEST9 {

	public static void main(String[] args) {
		int a = 1;
		int b = ++a;
		int c = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		//관계 연산자********************중요
		boolean isSuccess = true;
		// 2 > 1 true
		// 좌항과 우항을 비교해서 참 true, 거짓 false 로 출력한다.
		// 2 > 1 좌항이 우항보다 크면 true. 아니면 false
		// 2 < 1 좌항이 우항보다 작으면 true, 아니면 false
		// 2 >= 1 좌항이 우항보다 크거나 같이면 true, 아니면 false
		// 2 == 1 좌항과 우항이 같으면 true, 아니면 false
		// 2 != 1 좌항과 우항이 같지 않으면 true, 아니면 false
		
		int myAge = 51;
		// 내 나이가 30살 보다 크면 true. 아니면 false
		// 비교하고 싶은것을 먼저 입력한다
		// 코드컨벤션 - 코드의 규칙을 말하며 각 회사마다 스타일이 다름
		boolean result = myAge > 30;
		System.out.println(result);
		
		System.out.println(3 % 3 == 0);
		
		// for 반복문
		// if 비교문
		// array 배열
		
	}

}
