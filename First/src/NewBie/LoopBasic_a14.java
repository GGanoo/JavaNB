package NewBie;

public class LoopBasic_a14 {

	public static void main(String[] args) {
		
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0;j < 5; j++)
//				System.out.print("*");
//			System.out.println("");
//		}
//		System.out.println();
		
		int starCnt = 1;

		int spaceCnt = 4/2 + 1;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < spaceCnt; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j < starCnt; j++) {

				System.out.print('*');

			}

				spaceCnt -= 1;

				starCnt += 2;

			System.out.println();

		}

 

 

 

	}

}
