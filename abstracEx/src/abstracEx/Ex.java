package abstracEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> b = new ArrayList<Integer>(a);
		
		//ArrayList<Integer> b = a       이런식으로 쓰면, b 에 a가 컴퓨터에 저장된 위치를 넣는다.  (a와b는 같은 존재)
		//ArrayList<Integer> b = new ArrayList<Integer>(a);   이건 b 에다가 a의 내용을 가진 list 를 새로만들어서 넣어라. (a와b는다른존재) 
		
		int aa;
		int bb;
		String cc;
		
		//컴퓨터메모리에(지금 실행중인 프로그램에서 써야되는 변수들)
		//int aa [000001] 이런식으로 저장공간을 빌려준다
		//int bb [000002] 이런식으로 저장공간을 빌려준다
		//String aa [000003] 이런식으로 저장공간을 빌려준다
		
		
		//a=1 b=2   a=b 
		//사람생각엔 a에2가들어간다고 생각하는데
		//컴퓨터는 저장공간을 아껴야해서 그냥 a부르면b로가게해버림
		
		
		//그래서 aa=bb라고했을때
		//컴퓨터는 저장공간을 아끼기 위해서
		//[000001]에다가[000002]값을 넣는게 아니라
		//그냥 a b 둘다 [000002]라고 쳐버림.
		//그래서 b=a했을때 속 값이 둘이 같아서 a==b가 true
		
		//근데 a=new b라는식으로 굳이 b의 속 값만 가져와달라고 요청하면
		//a[000001]에다가 b의 값을 저장해야하고
		//b[000002]도 있어야 하기 때문에
		//둘이 다른 상태로 존재한다.
		
		a.add(4);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
