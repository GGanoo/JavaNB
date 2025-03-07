
public class ConditionEx3 {

	public static void main(String[] args) {
		// 점수
		int score = 70;
		// 등급 텍스트
		String result = "이 우유는 ";
		System.out.print(result);
		// 90 이상 : result A등급 입니다.
		// 80 ~ 90 미만 : B등급 입니다.
		// 70 ~ 80 미만 : C등급 입니다.
		// 70이하 : F등급 입니다.
		
		if (score > 90) {
			System.out.println("A등급 입니다.");
		}
		else if (score > 80) {
			System.out.println("B등급 입니다.");
			}
		else if (score > 70) {
			System.out.println("C등급 입니다.");
			}
		else if (score <= 70) {
			System.out.println("D등급 입니다.");
			}
		
		}
	


	
	

}