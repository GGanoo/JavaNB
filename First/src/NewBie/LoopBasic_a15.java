package NewBie;

public class LoopBasic_a15 {

	public static void main(String[] args) {
		
		int starCnt = 1;

		int spaceCnt = 7/2 + 1;

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < spaceCnt; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j < starCnt; j++) {

				System.out.print('*');

			}

			for (int j = 0; j < spaceCnt; j++) {

				System.out.print(" ");

			}

			if (i < 7 / 2) {

				spaceCnt -= 1;

				starCnt += 2;

			} else {

				spaceCnt += 1;

				starCnt -= 2;

			}

			System.out.println();

		}

 

 

 

	}

}