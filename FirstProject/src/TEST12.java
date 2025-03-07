
public class TEST12 {

	public static void main(String[] args) {
		
		// 비교문, 반복문, 배열
		// (조건) ? 참 : 거짓
		// if (조건) {참} else {거짓}
		// else는 상황에 따라 없을 수도 있다.
		
//		if (조건) {
	//		// 참일때 코드
		//} else {
			// 거짓일때 코드
	//}
		int base = 180;
		int height = 185;
		boolean isTall = height < base;
	//	String result = (height > base) ? "크다" : "작다";
	//	System.out.println(isTall);
		
		
		if (isTall) {
			System.out.println("크다");
		} else {
			System.out.println("작다");
		}
	
	int i = 3;
	// 1번 : 3항 연산자로 변수값 i가 홀수인지 짝수인지 판단
	// 2번 : 위 내용을 if else 구문으로 출력
	// 홀수 짝수 판단은 나머지 값으로 판단	
	
	System.out.println(i % 2 == 1 ? "홀수" : "짝수" );
	
	if (i % 2 == 1) {
		System.out.println("홀수");
	}else {
		System.out.println("짝수");
	}
	
	
	boolean res1 = (i % 2 == 1);
	boolean res2 = (i % 2 == 1) ? true : false;
	String res3 = (i % 2 == 1) ? "홀" : "짝";
	System.out.println(res3);
	
	
	// 2번 
	int j = 3;
	if (j % 2 == 0) {
		System.out.println("짝수");
	} else {
		System.out.println("홀수");
	}	
	
}


	
		
		
		
}
