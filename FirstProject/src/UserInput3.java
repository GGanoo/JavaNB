
public class UserInput3 {

	public static void main(String[] args) {
		String a = "a";
		String b = "a";
		String c = new String("a");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		// call by reference 참조에 의한 호출
		// call by value 값에 의한 호출
		
		System.out.println(a == b);
		System.out.println(a.equals(c));
		
		// primitive type
		// byte, short, int , long, float, double, char, boolean
		// wrapper class  타입을 객채로 다루기 위한 케이스
		// Byte, Short, Integer, Long, Float, Double, Character, Boolean
		
		boolean a = true;
		Boolean b = ture;
	}

}
