package abstracEx;

import java.util.ArrayList;
import java.util.Arrays;




/*계산기{
}
클래스{
	메인{
	실행~
	}
}

계산기{
	메인{
	실행~
	}
}



*/


public class Calculator {
	int value;
	Calculator() {
		this.value = 0;
	}
	void add(int val) {
		this.value += val;
	}
	int getValue() {
		return this.value;
	}
	public boolean isOdd(int i) {
		return i % 2 == 1 ? true : false;
	}
	public int avg(int[] data) {
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		return total / data.length;
	}
	public int avg(ArrayList<Integer> data) {
		int total = 0;
		for ( int item : data ) {
			total += item;
		}
		return total / data.size();
	}

class MaxListCalculator extends Calculator {
	
	int total = 0;
	
		return this.calue > 100 ? 100 : this.value;
		
	}
	
	
	
}

public class AbstractExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());
		System.out.println(cal.isOdd(3)); // 3홀수 : true
		System.out.println(cal.isOdd(4)); // 4홀수 : false
		
		//배열로 받는 파라미터의 평균을 정수 리턴
		int[] data = {1,3,5,7,9};
		int result1 = cal.avg(data1);
		System.out.println(result1);
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
		int result2 = cal.avg(data2);
		System.out.println(result2);
		
		//계산기.평균구하기()를 만드는데,
		//계산기.평균구하기(입력값이 배열)
		//계산기.평균구하기(입력값이 리스트)
		//이거를 만들어보세요 (오버로딩)
		UpgradeCalculator ucal = new UpgradeCalculator();
		
		ucal.add(10);
		ucal.minus(3);
		System.out.println(ucal.getValue()); // 7

	
		
	
	// UpgradeCalculator 클래스를 만들고
	// 값을 뺄 수 있는 minus 메서드를 추가하자.


	
	
	
	
	ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
	ArrayList<Integer> b = a;
	
	a.add(4);
	
	System.out.println(a == b);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
//class MaxLimitCalculator{
//	// 객체 변수 value 가 100보다 큰 값을 가질 수 없도록 제한하는 동작
//	MaxLimitCalculator mcal = MaxLimitCalculator();
//	mcal.add(50);
//	mcal.add(60);
//	System.out.println(mcal.getValue()); // 출력
//	
//	
//	
//}


/*클래스{   
 * 
 * }
 * 
 * 클래스 {
 * 
 * 
 * }
 * 클래스 extends 상속{
 * 
 * }
 * 
 * 클래스(파일이름){
 * 			main{
 * 	
 * 	}
 * }
 *	
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

