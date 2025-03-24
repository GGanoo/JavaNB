package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

	public static String getDateTime() {
		// 현재 날짜 구하기
		LocalDateTime localDateTime = LocalDateTime.now();
		// 날짜가 출력될 포맷 정의
		
		// 날짜, 시간 표기할때
		// yyyy : 연도 표기
		// MM : 월 표기
		// dd : 날짜 표기
		// HH : 24시간 단위 표기
		// hh : 12시간 단위 표기 
		// mm : 분 표기
		// ss : 초 표기
		// S : 밀리세컨드 표기
		
		DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// 날짜 포맷 적용
		String formatedDate = localDateTime.format(dFormatter);
		return formatedDate;
				
	}
	
}
