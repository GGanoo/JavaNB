package homeWork;

/**
 * 아래의 3개 클래스로부터 공통부분을 뽑아 Unit이라는 클래스를 만들고, 
 * 이 코드를 상속받도록 코드를 변경하세요.
 */

// 보병
class Marine {
	// 현재위치
	int x;
	int y;
	
	void move(int x, int y) {
		// 지정된 위치로 이동
	}
	void stop() {
		// 현재 위치에 정지
	}
	void stemPack() {
		// 스팀팩을 사용한다.
	}
}
// 탱크
class Tank {
	// 현재위치
	int x;
	int y;
	
	void move(int x, int y) {
		// 지정된 위치로 이동
	}
	void stop() {
		// 현재 위치에 정지
	}
	void changeMode() {
		// 공격모드를 변환한다.
	}
}
// 수송선
class Dropship {
	// 현재위치
	int x;
	int y;
	
	void move(int x, int y) {
		// 지정된 위치로 이동
	}
	void stop() {
		// 현재 위치에 정지
	}
	void load() {
		// 선택된 대상을 태운다.
	}
	void unload() {
		// 선택된 대상을 내린다.
	}
}

public class ExtendsEx1 {

}
