package dao;
//jjj
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.ShopMember;
/*
 * 사용자에게 아이디를 입력 받아 한 명의 쇼핑몰 회원정보를 조회하는 소스코드를 작성하였으나, 코드가 누락되거나 잘못 작성 되었다는 지적을 받았다.
소스코드를 분석하여 모든 문제 원인(50점)과 조치내용(50점)을 서술하시오. (100점)

- 해당 코드에서는 발생되는 예외를 DAO에서 처리함.
- 문제에 포함되지 않은 클래스(View, Service, JDBCTemplate)와 코드(import 구문)는 모두 정상적으로 작성 되었다고 가정함.
 */
public class ShopDAO3 {



public ShopMember searchUser(Connection conn, String memberId) {

System.out.println("찾을아이디"+memberId);



PreparedStatement pstmt = null;
ResultSet rset = null;
ShopMember sm = null;
try {
String query = "SELECT * FROM SHOP_MEMBER WHERE MEMBER_ID = ?";
pstmt = conn.prepareStatement(query);
pstmt.setString(1, memberId);  // 1번째파라미터에맞는 pstmt.setString(1,memberId); 으로 ? 값 처리 
rset = pstmt.executeQuery();// executeQuery해줌으로써 sql실행, 그 결과를 rset에 넣음


   if(rset.next()) {
  
String mId = rset.getString("MEMBER_ID");
String memberPw = rset.getString("MEMBER_PW");
String phone = rset.getString("PHONE");
char gender = rset.getString("GENDER").charAt(0);

sm = new ShopMember(mId, memberPw, phone, gender);



}


}catch (SQLException e) {
e.printStackTrace();
}
finally{ //finally안에 try로 rset,pstmt,conn null체크 후 close한다

try{

if(rset!=null)rset.close();

if(pstmt!=null)pstmt.close();

if(conn!=null)conn.close();

}catch(SQLException e) {e.printStackTrace();}

}
return sm;
}

public static List<ShopMember> selectList() {
	// TODO Auto-generated method stub
	return null;
}

}