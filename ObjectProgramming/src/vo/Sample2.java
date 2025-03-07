package vo;
class Animal {
	String name;
	void setName(String name) {
		this.name = name;
	}
	public Animal() {}
}

//게임
//무기를 만든다
//칼 : 공격력 몇 / 속도 몇 
//총 공격력 몇 속도몇 탄몇
//폭탄 공격력 몇 거리몇
class weapon{
	int damage;
	String type="기본";
	
	public weapon() {
		//System.out.println("무기가 생성되었습니다. 아무 기능 X 타입은:"+this.type+", 데미지는"+this.damage);
		
	} //클래스 이름이랑 똑같은  ->클래스이름(){} 이렇게 생긴게 있다 : 생성자
	//생성될때 이 코드를 무조건 지나가야 해서 생성자
	
}
class sword extends weapon{
	public sword() {
		this.type="칼";
		this.damage=100;
		System.out.println("타입:"+this.type+", 데미지는"+this.damage);
	}
	public sword(int dmg) {
		this.type="칼";
		this.damage=dmg;
		System.out.println("타입:"+this.type+", 데미지는"+this.damage);
	}
	public sword(String type) {
		this.type=type;
		this.damage=100;
		System.out.println("타입:"+this.type+", 데미지는"+this.damage);
	}
	public sword(String type,int dmg) {
		this.type=type;
		this.damage=dmg;
		System.out.println("타입:"+this.type+", 데미지는"+this.damage);
	}
}
class gun extends weapon{
	int bullet;
	public gun() {

		this.type="총";
		this.damage=100;
		this.bullet=60;
		System.out.println("총(이)가 생성되었습니다. 아무 기능 X 타입은:"+this.type+", 데미지는"+this.damage+", 이 총의 탄약은"+this.bullet+"발");
	}
}
class bomb extends weapon{
	
}
	
	
	



public class Sample2 {
	public static void main(String[] args) {
			// IS-A 관계
			// Dog > Animal, Dog 는 Animal 의 하위 개념
			// Dog는 Animal에 포함되기떄문에 Dog는 Animal이다.
			// IS-A 관계라고한다.
	//		Animal a = new Dog();  		//사용가능
	//		Dog b = new Animal();		/상속 관계상 진행 할 수 없다
	//		Object c = new Animal(); 
			
			
			sword b = new sword();
			sword c = new sword("대검");
			sword d = new sword(60);
			sword e = new sword("장검",120);
			
	}

}

	
