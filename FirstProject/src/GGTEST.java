public class GGTEST {
	public static void main(String[] args) {
		int a = 10;
		//int 범위 -2147483648 ~ 2147483647
		// long 8바이트
		long b = 2147483648L;  //4바이트가 넘어가는 수는 L(long을 붙인다
		//실수 (소수점)
		// float,  double
		float pi = 3.14F;
		double pi2 = 3.14;
		
		//boolean 불리언, 불, 불린 (이라고 불림)
		//참 (true), 거짓(false)
		boolean bl = true;
		boolean bf = false;
		
		// char, String , ASCII(1바이트 코드만 사용)
		// unicode (2바이트 코드, 자바또한 2바이트)
		char ch = 'A';
		System.out.println((int)ch);
		
		int z = 65;
		System.out.println((char)z);
		
		

		
	}
}
