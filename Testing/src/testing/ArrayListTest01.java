package testing;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {


	public static void main(String[] args) {
	exam1();
	}

	static void exam1() {
		
		List<String> art = new ArrayList<String>();
		
		art.add("aa");
		art.add("qq");
		art.add("ww");
		art.add("ee");
		art.add("rr");
		art.add("tt");
		
		System.out.println(art);
		
		art.set(0, "Hi");
		art.set(1, "Bye");
		art.remove(2);
		
		System.out.println("존재함 :" + art.contains("Hi"));
		
		for (int i = 0; i < art.size(); i++) {
			System.out.println(art.get(i));
		}
	}
	
	
}
