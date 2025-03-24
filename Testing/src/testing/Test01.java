package testing;

import java.util.Random;

public class Test01 {
	// 이전의 gradeCalculator 메서드 유지//
    public static void gradeCalculator(String name, int score) {
        System.out.print(name + "의 점수: " + score + " - ");
        
        if (score >= 90) {
            System.out.println("A 등급입니다.");
        } else if (score >= 80) {
            System.out.println("B 등급입니다.");
        } else if (score >= 70) {
            System.out.println("C 등급입니다.");
        } else if (score >= 60) {
            System.out.println("D 등급입니다.");
        } else {
            System.out.println("F 등급입니다.");
        }
    }

public static void main(String[] args) {
	// 랜덤 점수 생성을 위한 Random 객체
    Random random = new Random();
    
    // 학생 이름 배열
    String[] students = {"김건우", "이지수", "박민호", "최영진", "정서윤"};
    
    // 5명의 학생에게 랜덤 점수 적용
    for (String student : students) {
        // 0부터 100 사이의 랜덤 점수 생성
        int randomScore = random.nextInt(101);
        
        // 학점 계산 메서드 호출
        gradeCalculator(student, randomScore);
    }
}
}
