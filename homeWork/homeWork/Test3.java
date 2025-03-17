package homeWork;

public class Test3 {
	// static 변수
	static int staticVar = 0;
	// final 상수
	static final int STATIC_FINAL_VAR = 0;
	
	public static void main(String[] args) {
		
		// static 변수 접근 시간 측정
		long startTime = System.nanoTime();
		for (int i= 0; i < 1000000000; i++) {
			staticVar += 1; // static 변수에 접근
		}
		long endTime = System.nanoTime();
		long staticTime = endTime - startTime;
		
		// static final 변수 접근 시간 측정
		startTime = System.nanoTime();
		for (int i= 0; i < 1000000000; i++) {
			int temp = STATIC_FINAL_VAR;
	}
		endTime = System.nanoTime();
		long staticFinalTime = endTime - startTime;
		
		System.out.println("static 속도 : " + staticTime + " ns");
		System.out.println("static Final 속도 : " + staticFinalTime + " ns");

	}
}
