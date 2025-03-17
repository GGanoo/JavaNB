package homeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {

		// == 와 . equals()
//		// 기본타입은 ==로 비교
//		int a = 0;
//		int b = 0;
//		System.out.println(a ==b );
//		Integer c = new Integer(100);
//		Integer d = new Integer(100);
//		System.out.println(c == d);
//		System.out.println(c.equals(d));
		
		// 자동 형변환과 강제 형변환
		// 자동 현변환
		// 자료형이 작은타입에서 큰타입으로 바꿀때는 자동 현변환
		// 큰타입에서 작은타입으로 바꿀때는 캐스팅 필요
		int num = 10;
		double d = num;
		System.out.println(d);
		
		double d2 = 10.55;
		int num2 = (int)d2;
		System.out.println(num2);
		
		// in t / int =>>>> double
		int a = 5;
		int b = 2;
		System.out.println((double)a / b);
		
		// int 범위를 벗어나는 변수값
		// 214783647
//		int max = 2147836480;
//		// 범위를 벗어나면 long을 사용하자
//		long max2 = 12345678900L;
		
		// 객체 초기값 누락 null point exception (NPE)
//		String str;
//		System.out.println(str.length());
		
		// 대입연산자와 비교연산자 혼동
		boolean result = true;
		if (result == true) System.out.println(true);
		
		
		// ArrayList 와 for each
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("1","2","3"));
		for (   String s :  list   ) {
			if (s.equals("2")) s = "100";
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("2") {
				list.set(i, "100");
				
			}
		}
	}

}
