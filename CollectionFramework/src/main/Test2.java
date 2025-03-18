package main;

import collection.Member;

public class Test2 {

	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "박서훤");
		Member memberPark = new Member(1001, "이지원");
		Member memberPark = new Member(1004, "홍길동");
		Member memberPark = new Member(1002, "손민국");
		
		memberHashMap.addMember(memberpark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
	}

}
