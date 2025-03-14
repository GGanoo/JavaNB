package abstracEx2;
import java.util.ArrayList;



class Buyer {

	int money = 1000;

	ArrayList<Product> cart = new ArrayList<Product>();

	void buy(Product p) {

		// 보유 금액과 물건값을 비교해서 보유 금액이 적으면 메서드 종료

		if (this.money < p.getPrice()) {

			System.out.println("잔액이 부족해서 " + p.toString() + "을 못샀다.");
			
			
			
			return;

		}

 

		// 가진 돈이 충분하면 제품의 가격을 보유 금액에서 차감

		this.money -= p.getPrice();

 

		// 장바구니에 물건을 담는다 ---> add 메서드 호출

		this.add(p);

	}

	void add(Product p) {

		cart.add(p);

	}

	// 구입한 물건의 목록과 사용금액, 남은 금액 출력

	void summary() {

		String itemList = "";

		int sum = 0;

		for (Product item : cart) {

			itemList += item.toString() + ", ";

			sum += item.getPrice();

		}

		System.out.println("구입한 물건 : " + itemList);

		System.out.println("사용한 금액 : " + sum);

		System.out.println("남은 금액 : " + this.money);

	}

}

 

class Product {

	private int price;

	Product(int price) {

		this.price = price;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {

		this.price = price;

	}

}

class Tv extends Product {

	Tv() {

		super(100);

	}

	@Override

	public String toString() {

		return "Tv";

	}

}

class Computer extends Product {

	Computer() {

		super(200);

	}

	@Override

	public String toString() {

		return "Computer";

	}

}

class Audio extends Product {

	Audio() {

		super(50);

	}

	@Override

	public String toString() {

		return "Audio";

	}

}

 

public class Ex3 extends Object {

	public static void main(String[] args) {

 

		Buyer buyer = new Buyer();

		buyer.buy(new Tv());

		buyer.buy(new Computer());

		buyer.buy(new Computer());

		buyer.buy(new Computer());

		buyer.summary();

		//printf(표시될 데이터를 구분할 수 있다)
		//pritnf(%s또는 %d 자리가 데이터로 교체됨
		//printf("어쩌구저쩌구%s어쩌구%d저쩌구",첫번째%자리에 들어갈데이터 , 두번째%)
		System.out.printf("123 %s 321 %d 444","글자",123);

	}

 

}