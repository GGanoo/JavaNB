package abstracEx;

import java.util.Arrays;

public class AbstractExample {

	public static void main(String[] args) {
			
//			// Object에서 공통으로 사용하는 메서드
//			String b = a.toString(); // 객체를 문자열로 표현
//			a.equals(""); // . 앞에 있는 내용과 괄호 안의 내용 비교
//			a.hashCode(); // 해시코드
//			System.out.println(a.hashCode());
//			a.getClass(); // 객체의 class를 반환
			
		String a = "hello world";
		//  index 번째 문자 출력
		System.out.println(a.charAt(0));
		//	문자열 합치기
		System.out.println(a.concat("!!"));
		//	문자열 포함 여부
		System.out.println(a.contains("@"));
		//	문자열 길이
		System.out.println(a.length());
		//	문자열의 index번호 부터 끝까지의 문자열을 반환
		System.out.println(a.substring(3)); //3입력시 4번째 문자열부터 끝까지 출력한다
		//	문자열의 beginIndex부터 endIndex까지 문자열 반환
		System.out.println(a.substring(3, 6));
		//	문자열에서 주어진 문자열이 처음 나타나는 index 반환
		System.out.println(a.indexOf("world"));
		//	문자열에서 주어진 문자열이 마지막으로 나타나는 index 반환
		String str = "Hello world world";
		System.out.println(str.lastIndexOf("world"));
		//	문자열이 동일한지 비교
		String str1 = "hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3.equals(str4));
		//	문자열을 대소문자 구분하지 않고 비교
		System.out.println(str1.equalsIgnoreCase(str2));
		//	문자열에서 특정 문자열을 다른 문자열로 바꾼다
		System.out.println(a.replace("world","java"));
		//	문자열을 대문자로 변환
		System.out.println(a.toUpperCase());
		String str6 = "HELLO WORLD";
		System.out.println(str6.toLowerCase());
		//	문자열의 앞 뒤 공백 제거
		String str7 = "  hello  ";
		System.out.println(str7.trim());
		//	지정한 구분자를 기준으로 문자열을 배열로 반환
		String str8 = "apple, banana, cherry";
		String[] fruits = str8.split(",");
		System.out.println(Arrays.toString(fruits));
		//	문자열이 지정된 접두어로 시작하는지 확인
		String str9 = "Hello";
		System.out.println(str9.startsWith("He"));  //시작글자가 같은가
		//	문자열이 지정된 접미어로 끝나는지 확인
		System.out.println(str9.endsWith("lo"));
		//	문자열이 비어있는지 확인 (기이가 0인지 확인)
		String str10 = "";
		System.out.println(str10.isEmpty());
		//	문자열이 비어있거나 공백만 있는지 확인
		String str11 = " ";
		System.out.println(str11.isBlank());
		//	객체를 문자열로 변환
		int num = 123;
		String str12 = String.valueOf(num);
		System.out.println(str12);
		//	문자열이 주어진 정규식과 일치하는지 확인
		String str100 = "abc123";
		boolean match = str100.matches("[a-z]+\\d+");
		System.out.println(match);
		
	
		
		
		//	문자열의 길이가 홀수일 경우, 한 문자를 출력하고, 짝수일 경우 중간 두 문자를 출력해라.
		// 	입력 : Java
		//	출력 : av
		//	입력 : Programming
		//	출력 : a
				
		
		String i = "Programming";
		System.out.println(i.substring(3,6));
		System.out.println(i.length());
		int iLength = i.length();
		String iResult = (iLength % 2 == 0) ?
				i.substring(iLength / 2- 1, iLength / 2 + 1) : 
					i.substring(iLength / 2, iLength /2 + 1);
		System.out.println(iResult);
				
		
		//  아래 문자열에서 첫번째 단어를 추출해라. 단어는 공백으로 구분된다.
			String ex2 = "I love java";
			// I 
			System.out.println(ex2.split(" ")[0]);
			
			
		// 010-1234-5678 주어진 문자를 -를 제거하고 숫자만 출력
			String Phone = "010-1234-5678";
			System.out.println(Phone.replace("-", ""));
			
		//http://www.naver.com/path 문자열에서 naver.com만 출력
			
			String url = "http://www.naver.com/path";
			String domain = url.substring(url.indexOf("www.") +4, url.indexOf(".com") + 4);
			System.out.println(domain);
			
			
		// 20250314 ----> 2025-03-14 변경하기
			String DD = "20250314";
			System.out.println(   DD.substring(0,4) + "-" + DD.substring(4,6) + "-" + DD.substring(6)  );
			
			
			
			// Buyer 클래스 : money, cart (배열)
			// 메서드 : buy(구입), add(장바구니 추가), summary(구입한 물건목록, 사용금액, 남은금액)
			// Product 클래스 : price
			// 상속받는 클래스 Tv(100), computer(200), Audio(50)
			
			
			
			
			
			
			
			
			
			
	}

}
