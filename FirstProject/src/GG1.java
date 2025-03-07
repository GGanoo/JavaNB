
public class GG1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean resultA = a > 0;
		System.out.println(resultA);
		boolean resultB = b > 0;
		System.out.println(resultB);
		
		// && : 논리곱 => && 로 구분된 좌측과 우측이 모두 true 일때
		// and
		String resultC = (a > 0) && (b > 0) ? "참" : "거짓";
		System.out.println(resultC);
		
		// || : 논리합 => ||로 구분된 좌측과 우측 중 하나가 true 일때
		// or
		String resultD = (a > 0) || (b > 0) ? "참" : "거짓";
		System.out.println(resultD);
		
		// ! : 부정 => !true 는 false, !false 는 true
		// not
		String resultE = !(a > 0) ? "참" : "거짓";
		System.out.println(resultE);
		
		if ((a > 0) && (b > 0)) { 
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		if ((a > 0) || (b > 0)) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		if (!(a < 0)) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
}

}
