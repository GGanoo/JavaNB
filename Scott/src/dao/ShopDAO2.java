package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import vo.ShopMember;


public class ShopDAO2 {
	public ShopMember searchUser(Connection conn, String memberId) {
		
	
	
		 PreparedStatement pstmt = null;
		 ResultSet rset = null;
				
		
	
		try {
			String query = "SELECT * FROM SHOP_MEMBER WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();			//데이터 가져오기
			
			if(rset.next()) {
				String memberId = rset.getString("MEMBER_ID");		//mId
				String memberPw = rset.getString("MEMBER_PW");
				String phone = rset.getString("PHONE");			
				char gender = rset.getString("GENDER").charAt(0);
				
				ShopMember sm = new ShopMember(); 	//mId
				sm.setMemberId(memberId);
				sm.setMemberPw(memberPw);
				sm.setPhone(phone);
				sm.setGender(gender);
				
				list.add(sm);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	

	
	}
	public static List<ShopMember> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
}
