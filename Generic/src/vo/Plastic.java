package vo;

public class Plastic {
	public void doPrint() {
		System.out.println("Plastic 재료로 출력");
	}

	@Override
	public String toString() {
		return "재료는 Plastic 입니다.";
	}

}
