
public class TEST6 {

	public static void main(String[] args) {
		
		// 바이트가 큰 자료에서 작은 자료로 바뀌는것 : 명시적 형변환 (강제 형변환)
		double  a = 10.5;
		int b = (int) a;
		System.out.println(b);
		
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int) dNum1 + (int) fNum2;
		int iNum4 = (int) (dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
	}

}
