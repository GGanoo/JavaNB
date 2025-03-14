package abstracEx;


import java.util.ArrayList;

import abstracEx2.Audio;
import abstracEx2.Tv;
class buyer {
	int money = 1000;
	ArrayList<product> cart = new ArrayList<product>();
	
	//메서드 buy 기능은 물건구입, 가진 돈에서 물건값을 빼고 장바구니에 담는다. 만약 가진 돈이 물건의 가격보다 적으면 바로 종료한다.
	// 반환타입 : X
	// 파라미터 : Product (구입할 물건)
	void buy(product p) {
		if(money < p.price)
			return;
		else {
		money-=p.price;
		add(p);
	
		}

	}
	// 메서드 명 : add 는 지정된 물건을 장바구니에 담는다.
	// 반환 타입 : X
	// 파라미터 : Product
	void add(product p) {
		cart.add(p);
		
	}
	// 메서드명 : summary 는 구입한 물건의 목록과 사용금액, 남은 금액 출력
	// 반환 타입 : X
	// 파라미터 : X
	void summary() {
		
		for(product p : cart) {
			System.out.println("물건:"+p+"가격"+p.price);
		}
		System.out.println("남은금액:"+this.money);
		
	}
}
class product {
	int price;
	product(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [price=" + price + "]";
	}
	
}
class Tv extends product {
	Tv() {
		super(100);
	}
	
}
class Com extends product {
	Com() {
		super(200);
	}
	
	
	
}
class Audio extends product {
	Audio() {
		super(50);
		
	}
}
public class Ex2 {
	public static void main(String[] args) {

		buyer a = new buyer();
		a.add(new Audio());
		a.add(new Tv());
		a.add(new Com());
		a.summary();
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
				// Buyer 클래스 : money, cart (배열)
				// 메서드 : buy(구입), add(장바구니 추가), summary(구입한 물건목록, 사용금액, 남은금액)	
				// Product 클래스 : price
				// 상속받는 클래스 Tv(100), computer(200), Audio(50)
				/////ok
	
				// 메서드 buy 기능은 물건구입, 가진 돈에서 물건값을 빼고 장바구니에 담는다. 만약 가진 돈이 물건의 가격보다 적으면 바로 종료한다.
				// 반환타입 : X
				// 파라미터 : Product (구입할 물건)
				
				// 메서드 명 : add 는 지정된 물건을 장바구니에 담는다.
				// 반환 타입 : X
				// 파라미터 : Product
				
				// 메서드명 : summary 는 구입한 물건의 목록과 사용금액, 남은 금액 출력
				// 반환 타입 : X
				// 파라미터 : X

