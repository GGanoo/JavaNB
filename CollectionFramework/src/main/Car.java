package main;

import java.util.HashMap;

class Car {
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2); //true로 나와야 한다.
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1 == avante2);
		
		System.out.println(sonata1 == avante1);
	
	}
}
class CarFactory {
	private static CarFactory instance = new CarFactory();
	HashMap<String, Car> carMap = new HashMap<>();
	private CarFactory() {}
	public static CarFactory getInstance() {
		if (instance == null) instance = new CarFactory();
		return instance;
	}
	public Car createCar(String name) {
		if (carMap.containsKey(name)) {
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
}