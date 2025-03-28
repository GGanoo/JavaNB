package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class StreamBasic05 {

	public static void main(String[] args) {

		/**
		 *  파일을 저장했다.
		 *  파일 : a.txt > 안녕하세요.
		 *  파일 : a.txt > 잘가라.
		 *  중복 안되게 할  조건 :  파일 이름이 중복되지 않게 처리
		 *  abc.txt ,  abc.txt 중복파일시
		 *  c:/java/2025/03/28/abc.txt
		 */
		// 1. 사용자가 파일을 업로드하는 행위를 했다.
		// 2. 연월일 기준 폴더 생성
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");
		String ofrmattedDate = currentDate.format(formatter);
		System.out.println(ofrmattedDate);
		
		
		File dirs = new File("c:/java/"+ofrmattedDate);
		if (!dirs.exists()) {
			// 폴더가 없으면 생성
			if (dirs.mkdirs()) {
				System.out.println("폴더 생성 완료");
			}	else {
				System.out.println("폴더 생성 실패");
				return;
			}
			
			
			
			
			
		}
		
		// 2. 파일 생성 후 저장
		
		UUID uuid = UUID.randomUUID();   //랜덤 이름 생성
//		System.out.println(uuid);
		
		
		String fileName = uuid +".txt";
		File file = new File(dirs, fileName);
		String content = "It is a good day to die";
		
		try (BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"))) {
			write.write(content);
			System.out.println("저장 완료");
			
			
			
			
		}catch (Exception e) {
			
		}
		
		
		
		
	}

}
