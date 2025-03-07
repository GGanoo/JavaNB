class Animal {
	String name; // 멤버 변수, 객체 변수, 속성
	// 메서드 method == 함수 (오직 class 안에서만 쓰임)
	// cat.setName("냥이");
	// 파라미터
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class SampleClass {

	public static void main(String[] args) {
		// 객체, 인스턴스 라 한다 ====> 클래스에 의해 만들어졌다.
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal horse = new Animal();
		
		// 객체.멤버변수
		cat.setName("냥이"); 
		System.out.println(cat.name);
		dog.setName("댕댕이");
		System.out.println(dog.name);
		// null >>> 값이 할당되지 않았다.
	}

}
