package homeWork;

public class ShapeEx2 {
	
	static double sumArea(Shape[] arr) {
		double sum = 0;
		
		for (int i = 0; I < arr.length; i++) {
			sum += arr[i].calcArea
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * ShapeEx1 에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하세요.
		 * 1. 메서드명 : sumArea
		 * 	기능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환
		 *  반환타입 : double
		 *  매개변수 : Shape[] arr
		 */
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 : " + sumArea(arr));
		
		/**
		 * 위 실행 결과는 아래와 같다.
		 * 면적의 합 : 93.68140899333463
		 */
		
	}

}
