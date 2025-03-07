
public class TEST5 {

	public static void main(String[] args) {
		
		// 형변환
		
		int n = 10;
		double d = n;
		
		System.out.println(n);
		System.out.println(d);
		// 형변환 
		// 작은 바이트에서 큰 바이트로는 자동으로 형변환이 된다 이것은 '묵시적 형변환'이라함
		// 위와 같이 int 4바이트, double 8바이트

		
		int i = 100;
		float f = i;
		double r = i + f;
		System.out.println(r);
		// 바이트가 큰 자료에서 작은 자료로 바뀌는것 : 명시적 형변환 (강제 형변환)
		
		
		
	}

}
