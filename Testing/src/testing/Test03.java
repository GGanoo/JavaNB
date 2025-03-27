package testing;

public class Test03 {

	private int plus (int val1, int val2) {
		return val1 + val2;
	}
	
	private int minus (int val1, int val2) {
		return val1 - val2;
		
	}
	private void multiple (int val1, int val2) {
		System.out.println(val1 * val2);
	}
	
	public static void main(String[] args) {
		Test03 exa = new Test03();
		int r1 = exa.plus(20, 30);
		int r2 = exa.minus(10, 20);
		exa.multiple(r1, r2);
		
	}

}
