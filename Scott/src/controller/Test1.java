package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	static final String DB_ID="scott";
	static final String DB_PW="tiger";
	static final String DB_IP="localhost";
	static final String DB_PORT="1521";
			
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatementcontent pstmt = null;
		ResultSet rset = null;
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		int input = -1;
		
		Scanner sc = new Scanner(System.in);
		while(input !=0) {
			System.out.println("사용 할 기능 입력 (1): SELECT ALL (2):SELECT INPUT (3):INSERT VALUE (4):DELETE BY EMPNO "
					 + "(5):UPDATE BY EMPNO (0):EXIT");
			input = sc.nextInt();
				switch(input) {
					
				case 1 : Func1(conn,pstmt,rset,emplist);break;
				case 2 : Func2(conn,pstmt,rset,emplist);break;
				case 3 : Func3(conn,pstmt,rset,emplist);break;
				case 4 : Func4(conn,pstmt,rset,emplist);break;
				case 5 : Func5(conn,pstmt,rset,emplist);break;
					
			}
		}
	sc.close();
	}
	public static void Func1 (Connection conn, PreparedStatement pstmt,
			ResultSet rset, ArrayList<Emp> emplist) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}
	}
}
