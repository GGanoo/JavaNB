
public class ConditionEx4 {

	public static void main(String[] args) {
		// 점수
		int score = 71;
		// 등급 텍스트
		String result = "";
		
		// 90 이상 : result A등급 입니다.
		// 80 ~ 90 미만 : B등급 입니다.
		// 70 ~ 80 미만 : C등급 입니다.
		// 70이하 : F등급 입니다.
		
		if (score > 90) {
			result = "A";
		}
		else if (score > 80) {					// 쉬운방법
			result = "B";
			}
		else if (score > 70 && score < 80) {	//다른방법
			result = "C";
			}
		else if (score <= 70) {
			result = "D";
			}
		System.out.println(result + "등급입니다.");
		}
	


	
	

}