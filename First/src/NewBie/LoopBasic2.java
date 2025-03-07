package NewBie;

public class LoopBasic2 {

	public static void main(String[] args) {
		
		
		// 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4)
		// ............... (1 +.... 10)
		// 합계가 220이 나오도록
		
		int sum = 0;
		int totalSum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = 0;
					for(int j=1;j<=i;j++)
						sum += j;
					totalSum +=sum;
			// i 값이 증가
			// sum 에 i 값을 누적 저장하면
			// sum = 1+3+6+10+.....55
			// totalSum >>> sum 을 누적
			
			
		}
		totalSum=0;
		sum=1;
		for(int i=1;i<=2;i++) {
			sum+=i;
		}
		totalSum+=sum;
		sum=0;
		for(int i=1;i<=3;i++) {
			sum+=i;
		}
		totalSum+=sum;
		sum=0;
		for(int i=1;i<=4;i++) {
			sum+=i;
		}
		totalSum+=sum;
		sum=0;
		for(int i=1;i<=5;i++) {
			sum+=i;
		}
		totalSum+=sum;
		sum=0;
		for(int i=1;i<=6;i++) {
			sum+=i;
			
		}
		totalSum+=sum;
		sum=0;
		for(int i=1;i<=7;i++) {
			sum+=i;
			
		}
		totalSum+=sum;
		sum=0;
		for(int i=1;i<=8;i++) {
			sum+=i;
			
		}
		totalSum+=sum;
		sum=0;
		for(int i=1;i<=9;i++) {
			sum+=i;
			
		}
		totalSum+=sum;
		sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			
		}
		totalSum+=sum;
		
		
		System.out.println("totalSum=" + totalSum);
		// i    sum     totalSum
		// 1     1          1
		// 2     3=1+2      4 = 1+3 = 1 + (1+2)
		// 3     6=1+2+3    10= 1+3+6 = 1+(1+2)+(1+2+3)
		
		
		
		
		
		}

		
}
