package main;

public class Test {
	
	// 아메리카노, 아이스 아메리카노, 카페라떼
	enum CoffeeType {
		AMERICANO,
		ICE_AMERICANO,
		CAFE_LATTE
	}

	public static void main(String[] args) {
		
		// 상수 집합 : enum
		System.out.println(CoffeeType.AMERICANO);
		System.out.println(CoffeeType.ICE_AMERICANO);
		System.out.println(CoffeeType.CAFE_LATTE);
		for (CoffeeType type : CoffeeType.values()) {
			System.out.println(type);
		}
	}

}
