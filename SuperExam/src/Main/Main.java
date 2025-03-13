package Main;

interface Predator {
	String getFood();
}

class Animal {
	String name;
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator {
	@Override
	public String getFood() {
		return "apple";
	}

	}


class Lion extends Animal implements Predator {
	@Override
	public String getFood() {
		return "banana";
	}
	
}

class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed apple" + predator.getFood());
	}

}

public class Main {

	public static void main(String[] args) {
			
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
	}
}
