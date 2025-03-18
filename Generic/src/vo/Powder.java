package vo;

public class Powder {
	public void doPrint() {
		System.out.println("Powder 재료로 출력");
	}

	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}
}
