
public class TEST8 {

	public static void main(String[] args) {
		// ++ : 값의 증가
		// -- : 값의 감소
		// 증가 및 감소 연산자가 붙는 위치에 따라 결과가 다르다.
		// a++ 후위, ++a 전위
		int a = 1;
		System.out.println(a);
		a++; // a = a + 1; 와 동일하다.
		System.out.println(a);
		
		a--; // a= a - 1; 와 동일하다.
		System.out.println(a);
		
		System.out.println(a++);
		System.out.println(a);
	}

}
