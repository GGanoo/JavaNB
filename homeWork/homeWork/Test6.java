package homeWork;

import homeWork.Test5.Box;

class Box<T extends Number> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	public void swapItems(Box<T> otherBox) {
		// a = 1;
		// b = 2;
		// 값을 바꿀때 로직
		// 임시 변수 >> a 에 있는 값을 임시 변수에 대입
		// b >> a 에 대입 >> 임시 변수에 있는 값을 다시 b 에 넣는다. //임시변수는 T라 지정
		T temp = this.item;
		this.item = otherBox.item;
		otherBox.item = temp;
	}
	public void printBoxType() {
		System.out.println(this.item);
	}
}
public class Test6 {

	public static void main(String[] args) {

//		문제: 제네릭을 활용한 "컨테이너 클래스" 구현
//		제네릭을 활용하여 Box<T>라는 클래스를 구현한다. 
//		이 클래스는 하나의 객체를 담을 수 있는 용기(Box) 역할을 한다. 
//		이 클래스는 다음과 같은 기능을 제공해야 합니다:
	//
//		setItem(T item) : Box에 객체를 넣는 메서드
//		getItem() : Box에서 객체를 꺼내는 메서드입니다. 만약 객체가 비어있다면, null을 반환
//		swapItems(Box<T> otherBox) : 현재 Box에 있는 객체와 다른 Box에 있는 객체를 서로 교환하는 메서드.
//		printBoxType() : 현재 Box에 담겨 있는 객체의 타입을 출력하는 메서드
//		그리고, Box 클래스에서 구현된 모든 메서드에 대해 다음의 요구 사항을 만족해야 한다.
	//
//		swapItems 메서드는 두 Box 객체의 타입이 일치할 때만 동작하도록 해야 한다.
//		Box 클래스는 제네릭 타입 T를 가지며, T 타입은 반드시 Number 클래스 또는 그 하위 클래스여야만 한다.
	//
			
//		실행 코드 
		Box<Integer> box1 = new Box<>();
		Box<Double> box2 = new Box<>();

		box1.setItem(10);
		box2.setItem(3.14);

		box1.swapItems(box2); // box1과 box2의 값을 교환

		System.out.println(box1.getItem()); // 출력: 3.14
		System.out.println(box2.getItem()); // 출력: 10.0

		box1.printBoxType(); // 출력: Box 타입: class java.lang.Double
		box2.printBoxType(); // 출력: Box 타입: class java.lang.Integer

		
		
	}

}
