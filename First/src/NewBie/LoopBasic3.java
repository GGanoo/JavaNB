package NewBie;

public class LoopBasic3 {

	public static void main(String[] args) {
		int rank = 1;
		String medalcolor = "A";
		// rank 1 medalcolor G
		// rank 2 medalcolor S
		// rank 3 medalcolor B
		// rank 나머지 medalcolor A
		if (rank == 1) {
			medalcolor = "G";
		} else if (rank == 2) {
			medalcolor = "S";
		} else if (rank == 3) {
			medalcolor = "B";
		} 								// else A가 필요없을때
		switch(rank) {
		case 1:
			medalcolor = "G";
			break;
		case 2:
			medalcolor = "S";
			break;
		case 3 :
			medalcolor = "B";
			break;
		default :
			medalcolor = "A";
			break;
		}
		System.out.println(rank + "등의 메달은" + medalcolor + "입니다.");
		
	}

}
