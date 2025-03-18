package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Person {
	String name;
	String birth;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	}
	
	// getter, setter, constructor


public class Main {

	private static final HashMap<String, String> hashMap = null;

	public static void main(String[] args) {
		// 컬렉션 프레임워크 Collection Framework
		// 자바에서 데이터를 저장하고 관리하는 방법을 제공하는 클래스, 인터페이스의 집합
		// 여러개의 데이터를 효율적으로 다루기 위한 도구
		
		// 핵심
		// 데이터 구조 : 데이터를 어떻게 저장하고 접근할것인가의 구조 정의
		// 효율적 관리 : 데이터를 쉽게 추가, 삭제, 변경, 순회하는 작업을 효율적으로 할수있게 해준다.
		
		// 컬렉션 프레임워크 : 컬렉션, 맵 두가지로 나뉜다.
		// 1.컬렉션 : 여러개의 데이터를 하나의 객체로 다루는 방법을 제공
		// 2. 맵 : 키(key)와 값(value) 쌍으로 이루어진 데이터 구조이고 중복되지 않는 키를 사용해서 값을 찾을 수 있다.
		
		// 집합
		// HashmMap, LinkedHashMap, TreeMap - 일반 자료형
		// 집합자료형 : 집합과 관련된것을 쉽게 처리하기위해 만들었다.
		// HashSet, LinkedHashSet, TreeSet
		
		HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
//		System.out.println(set);
		
		// 첫번째 1,2,3,4,5,6
		// 두번째 4,5,6,7,8,9
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
		
		// 교집합 구하기 : retainAll
		// HashSet 하나더 생성 >>> new 연산자의 파라미터를 s1 넣는다.
		// retainAll 메서드의 파라미터를 s2 넣는다.
		// 로그에 찍는다.
		HashSet<Integer> s3 = new HashSet<>(s1);
		s3.retainAll(s2);
		System.out.println(s3);
		
		// 합집합 구하기 : addAll
		// 1,2,3,4,5,6,7,8,9
		HashSet<Integer> d2 = new HashSet<>(s1);
		d2.addAll(s2);
		System.out.println(d2);
		
		// 차집합 구하기 : removeAll
		// 1,2,3
		HashSet<Integer> a2 = new HashSet<>(s1);
		a2.removeAll(a2);
		System.out.println(a2);
		
		// add, addAll, remove
		a2.add(100);
		a2.addAll(Arrays.asList(55,66,77));
		a2.remove(55);
		
		// HashMap, List 	무작위
		// LinkedHashMap	입력차순
		// TreeMap			오름차순
		
		String[] nums = new String[] {"333", "123", "256"};
		List<String> numsList = new ArrayList<String>(Arrays.asList("333", "123", "256"));
		numsList.sort(Comparator.naturalOrder());
		System.out.println(numsList);
		numsList.sort(Comparator.reverseOrder());
		System.out.println(numsList);
		
		// add 컬렉션에 데이터를 추가한다.
		numsList.add("444");
		System.out.println(numsList);
		numsList.remove("444");
		numsList.remove("0");
		System.out.println(numsList);
		// size()
		System.out.println(numsList.size());
		// clear()
		numsList.clear();
		System.out.println(numsList);
		// Iterator
		
		
		// 맵 : 사전과 비슷하다
		// people : 사람, baseball : 야구
		// name : 최종선, birth : 20000101
		// key : value
		// key 와 value 가 쌍으로 이루어 진걸 맵이라고 한다.
		// Map : HashMap, LinkedHshMap, TreeMap 등등
		// VO, HashMap
		// VO
//		person person = new Person<>();
//		person.setName("최종선");
//		person.setBirth("20000101");
//		person.setAge(10));
//		person.getName();
//		person.getBirth();
//		String birth = person.getBirth();
//		List<Person> personList = new ArrayList<>();
//		
//		HashMap<String, Object> hashMap : new hashMap<>();
//		hashMap.put("name", "최종선");
//		hashMap.put("birth", "20000101");
//		hashMap.put("age", 10);
//		String name2 = (String) hashMap.get("name");
//		String birth2 = hashMap.getMap.get("birth");
//		int age2 = (int) hashMap.get("age");
//		
		// containsKey : 맵에 해당 key가 있는지 true, false로 리턴
//		System.out.println(hashMap.containsKey("birth"));
		// remove : 맵의 항목을 삭제한다. 해당 key로 항목을 삭제 후 value를 리턴
//		System.out.println(hashMap.remove("name"));
//		System.out.println(hashMap.toString());
		// size : 맵의 요소 갯수 리턴
//		sys
//		//keySet : 맵의 모든 key 를 모아서 리턴
//		sys
//		List<String> keyList = new ArrayList<>(hashMap.keySet());
		
		// Map >>> HashMap, LinkedHashMap, TreeMap
		// LinkedHashMap : 입력된 순서대로 데이터를 저장
		// TreeMap : 입력된 key의 오름차순으로 데이터를 저장
		
		
		// JSON : JavaScript Object Notation
		
		
		
		
		List<HashMap<String, String>> hashMapList = new ArrayList<>();
		hashMapList.add(hashMap);
		
	}

}
