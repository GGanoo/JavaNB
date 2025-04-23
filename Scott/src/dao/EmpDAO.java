package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.EmpVO;

public class EmpDAO {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rSet = null;
	
	/**
	 * DB 접속
	 */
	public static void connectAction() {

		/**
		 * 1. DB 연결 설정
		 * 2. 객채 생성
		 * 3. SELECT 해보기
		 * 4. SELECT 파라미터 넣기
		 * 5. INSERT 해보기
		 * 6. UPDATE 해보기
		 * 7. DELETE 해보기
		 */
		/**
		 * URL, username, password
		 */
		
		try {
			// 드라이버를 JVM에 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			/**
			 * DB에 접속 시도
			 * jdbc : Java Database Connectivity (자바에서 jdbc를 사용하겠다)
			 * oracle : 오라클 데이터 베이스 사용 선언 (mysql, mariadb, mssql)
			 * thin : 오라클에서 thin이라는 드라이버를 사용하겠다.
			 * localhost : 접속 ip
			 * 1521 : 접속 port
			 * xe : express edition 기본 서비명 (개인, 학습, 테스트용) 무료 버전, 성능 제한
			 * orcl : 기업, 상업, 대규모 시스템 (유료, 고성능)
			 * 
			 * 오라클 : 계정 > 스키마, db역할 , 물리적으로 하나의 db인스턴스에서 동작
			 * mysql, mssql : 공통 db안에 여러 사용자 존재
			 */
			
			/**
			 * Connection Class
			 * DB 연결 + SQL 실행
			 * prepareStatement(sql문 string형태) : 
			 * 			SQL이 담긴 PrepareStatement라는 객체 생성
			 * createStatement() : 기본 Statement 객체 생성
			 * setAutoCommit(bool) : 자동 커밋 여부
			 * commit() : 수동 커밋
			 * rollback() : 수동 롤백
			 * close() : 연결 종료 (자원 반환)
			 */
			/**
			 * DriverManager : JDBC 드라이버 관리, DB 연결 생성 클래스
			 */
			// 1. DB 접속
			conn = DriverManager
					.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			System.out.println("DB 접속 오류 : " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로딩 오류");
			e.printStackTrace();
		}
	}
	
	public static List<EmpVO> selectList() {
		connectAction();
		List<EmpVO> list = new ArrayList<>();
		try {
			// 2. 쿼리 실행
			String query = "SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO FROM EMP ";
			pstmt = conn.prepareStatement(query);
			rSet = pstmt.executeQuery();
			
			// 3. 결과 출력
			while (rSet.next()) {
				/**
				 * 컬럼이 문자 getString(컬럼명)
				 * 컬럼이 숫자 getLong(컬럼명) getInt(컬럼명)
				 * 컬럼이 소숫점 getDouble(컬럼명) getFloat(컬럼명)
				 * 컬럼이 날짜 getDate(컬럼명)
				 * 컬럼이 boolean getBoolean(컬럼명)
				 */
				Long empNo = rSet.getLong("EMPNO");
				String eName = rSet.getString("ENAME");
				String job = rSet.getString("JOB");
				Long mgr = rSet.getLong("MGR");
				Date hireDate = rSet.getDate("HIREDATE");
				Double sal = rSet.getDouble("SAL");
				Double comm = rSet.getDouble("COMM");
				Long deptNo = rSet.getLong("DEPTNO");
				
				EmpVO empVO = new EmpVO();
				empVO.setEmpNo(empNo);
				empVO.seteName(eName);
				empVO.setJob(job);
				empVO.setMgr(mgr);
				empVO.setHireDate(hireDate);
				empVO.setSal(sal);
				empVO.setComm(comm);
				empVO.setDeptNo(deptNo);
				
				list.add(empVO);
			}
		} catch (SQLException e) {
			System.out.println("쿼리 실행 오류");
		} finally {
			connectionCloseAction();
		}
		
		return list;
	}
	
	/**
	 * DB 접속 및 자원 반환
	 */
	public static void connectionCloseAction() {
		try {
			if (rSet != null) rSet.close();
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			System.out.println("자원 반환 오류");
		}
	}

}
