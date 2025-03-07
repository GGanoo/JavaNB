
public class Condition {

	public static void main(String[] args) {
		// 조건 연산자 ( 3항 연산자 )
		//    연산자        참일때: 거짓일때;
 		// (1 + 1 == 2) ? true : false;
		// boolean : true, false
		// 
		boolean result = (1 + 1 == 2) ? true : false;
		System.out.println(result);
		
		String res = (1 + 1 == 5) ? "같다" : "다르다";
		System.out.println(res);
}

}
