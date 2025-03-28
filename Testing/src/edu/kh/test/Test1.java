package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 import edu.kh.test.IPInfo;
public class Test1 {
	public static void main(String[] args) {
// 컬랙션 List를 이용해 IP별 사용자를 관리하고, IP를 입력 받아 일치하는 사용자가 있는지 검색하는
// 코드를 작성하였으나 오류 발생 및 정상 수행되지 않았다
// 소스 코드를 분석하여 원인(문제점 + 발생 원인), 조치내용(해결 방법 + 수정된 코드)를 작성하시오.
//		IPinfo.IPInfo(args){}
	
	
	Scanner sc = new Scanner(System.in);
	
	//List<String> ipInfoList = null;    
	List<IPInfo> ipInfoList = new ArrayList<IPInfo>(); // 배열됨
	
	ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
	ipInfoList.add(new IPInfo("212.133.7.8", "무명")); 		//이름없음
	ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
	
	System.out.println("ip 입력 : ");
	String ip = sc.next();
	
	for(int i=0 ; i < ipInfoList.size(); i++) {
		//if(ipInfoList.get(i) == ip) {
		if(ipInfoList.get(i).getIp().equals(ip)) {   // 글자끼리의 잘못된 비교
			System.out.println(ipInfoList.get(i));
			break;
		}
	
	if (i + 1 == ipInfoList.size())			// 입력 후 종료
	System.out.println("일치하는 ip 사용자가 없습니다.");
	}
	
	
	
	
	
	}

}
