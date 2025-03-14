package abstracEx;

import abstracEx2.Computer;

abstract class Computer {
	abstract void display();
	abstract void type();
	public void turnOn() {
		System.out.println("전원을 켠다.");
	
	}
	
class AAAAAA {
	final double PI = 3.14;
	}	
	
	public void turnOff() {
		System.out.println("전원을 끈다.");
	}
interface Constants {
	String API_KEY = "1234";
	}
}
class DeskTop extends Computer {
	void display() {
		System.out.println("computer display()");
	void type() {
		System.out.println("computer type()");
	}

}

class NoteBook extends Computer {

	@Override
	void display() {
		System.out.println("notebook display()");
	}

	@Override
	void type() {
		System.out.println("notebook type()");
	}
	
}

//public class AbstracExample {
//
//	public static void main(String[] args) {
//		Computer noteBook = new NoteBook();
//		noteBook.display();
//		noteBook.type();
//		noteBook.turnOn();
//		noteBook.turnOff();
//		Computer deskTop = new DeskTop();
//		String Key = Constants.API_KEY;
//	}
//
//}
