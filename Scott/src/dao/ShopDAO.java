package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import vo.ShopMember;
//회원 가입하는 소스코드를 작성하고  소스코드를 작성하였으나, 코드가 누락되거나 잘못 작성 되었다는 지적을 받았다.
//소스코드를 분석하여 모든 문제 원인(50점)과 조치내용(50점)을 서술하시오. (100점)
//-해당 코드에서는 발생되는 예외를 DAO에서 처리함.
//-문제에 포함되지 않은 클래스(View, Service, JDBCTemplate)와 코드(import 구문)는 모두 정상적으로 작성 되었다고 가정함.
public class ShopDAO {
	public int insertUser(Connection conn, ShopMember sm) {
//		Statement stmt = null;
		PreparedStatement pstmt = null; // Statement 는  바인딩 안됌. PreparedStatement 교체

		
		
		int result = 0;
		
		try {
		
		
			String query = "INSERT INTO SHOP_MEMBER VALUES(?, ?, ?, ?)";
            pstmt = conn.prepareStatement(query);
            
            
            // 파라미터 바인딩
            pstmt.setString(1, sm.getMemberId());
            pstmt.setString(2, sm.getMemberPw());
            pstmt.setString(3, sm.getPhone());
            pstmt.setString(4, String.valueOf(sm.getGender()));
            
            
	//		result = stmt.executeQuery(query)
			result = pstmt.executeUpdate();	//인서트 쿼리에 맞게 변경
					
					
		}catch (SQLException e) {
			e.printStackTrace();
			
			
		} finally {		//파이널에 닫는 추가  PreparedStatement
			   
			try {
	                if(pstmt != null) pstmt.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
		return result;
	
	
	
	}
		
}
