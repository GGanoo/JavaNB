
public class MethodArea_01 {
	int a; // 객체 변수 a
	void varTest(MethodArea_01 methodArea_01) {
		methodArea_01.a++;
	}
	void varTest2() {
		this.a++;
	}
	public static void main(String[] args) {
		// int a = 1;
		MethodArea_01 m = new MethodArea_01();  
		m.a = 1;
		m.varTest(m);
		System.out.println(m.a);
		MethodArea_01 m2 = new MethodArea_01();
		m2.a = 1;
		m2.varTest2();
		System.out.println(m2.a);
	}

}
