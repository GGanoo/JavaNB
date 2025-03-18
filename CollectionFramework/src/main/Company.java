package main;


// 싱글톤 패턴 


public class Company {
	private static Company instance = new Company();
	// 멤버변수
	private Company() {}
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	

	public static void main(String[] args) {
			
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		System.out.println(com1 == com2);
	}

}
