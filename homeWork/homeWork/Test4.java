package homeWork;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
}

public class Test4 {
		
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("homeWork.Person");
		System.out.println(c.getName());
		Constructor[] consts = c.getConstructors();
		for (Constructor item :consts) {
			System.out.println(item);
		}
		Field[] fields = c.getfields();{
		for (fields item : fields) {
			System.out.println(item);
		
		Method[] methods = c.getMethods();
		for (Method item : methods) {
			System.out.println(item);
		}
		}}
	}

}
