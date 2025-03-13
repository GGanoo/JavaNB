package ShuffleEx;

public class Shuffle {
	
	public static int[] excute(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int rnd = (int) Math.random() * arr.length;
			// arr[i]와 arr[rnd]의 값을 서로 바꾼다.
			int tmp = arr[i];
			arr[i] = arr[rnd];
			arr[rnd] = tmp;
		}
		return arr;
	}

	
}
