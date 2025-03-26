
public class ArrayListEx {

	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 갯수
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 갯수)
		// 필요한 바구니의 갯수
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0) ;
		System.out.println("필요한 바구니의 수 :" + numOfBucket );
		
		// 양수, 음수, 0 : 비교연산자 + 3항 연산자
		// 1차 : 양수, 음수만 판단
		// 2차 : 0까지 판단
		int num = 10; 		//0을 입력하여 쉽게 양수를 구분함
		String step1 = num > 0 ? "양수" : "음수";      //양수를 쉽게 구한다
		
		
		// (비교식) ? 참: (비교식) ? 참 : 거짓
		
		
	//	System.out.println(num == 0 ? "0" : num > 0 ? "양수" : "음수");
		System.out.println(step1);
		
		// 457 > 400
		// 111 > 100
		// 123 > 100
		int num1 = 111;
//		System.out.println(num1 -= num1 % 100);
		System.out.println(num1 / 100 * 100);
		
	}

}
