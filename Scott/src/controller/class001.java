package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class class001 { //★★★클래스이름확인
	static final String DB_ID="scott";
	static final String DB_PW="tiger";
	static final String DB_IP="200.200.200.62";//★★★여기 IP 바꾸기 > localhost
	static final String DB_PORT="1521";
	public static void main(String[] args) {
		//(공통변수)====================================================================================================================
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset=null;
		ArrayList<Emp> emplist = new ArrayList<Emp>();
		int input=-1;
		//====================================================================================================================
		
		//(무한반복)====================================================================================================================
		Scanner sc=new Scanner(System.in);
		while(input!=0) {
			System.out.println("사용할기능입력(1):SELECT ALL (2):SELECT INPUT (3):INSERT VALUE (4):DELETE BY EMPNO "
					+ "(5):UPDATE BY EMPNO (0):EXIT");
			input=sc.nextInt();
				switch(input) {
				//(기능분리)====================================================================================================================
					case 1 : Func1(conn,pstmt,rset,emplist);break;//SELECT * FROM EMP; 
					case 2 : Func2(conn,pstmt,rset,emplist);break;//SELECT [INPUT] FROM EMP;
					case 3 : Func3(conn,pstmt,rset,emplist);break;//INSERT VALUES
					case 4 : Func4(conn,pstmt,rset,emplist);break;//DELETE EMPNO=[INPUT]
					case 5 : Func5(conn,pstmt,rset,emplist);break;//UPDATE EMPNO=[INPUT]
					
				}
		}
		sc.close();
		//====================================================================================================================
	}
	public static void Func1(Connection conn,PreparedStatement pstmt,ResultSet rset,ArrayList<Emp> emplist) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@"+DB_IP+ ":"+DB_PORT+"/xe",
					DB_ID,DB_PW);
			
			
			String query="select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp";
			pstmt=conn.prepareStatement(query);
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				emplist.add( new Emp(rset.getInt("empno"),rset.getString("ename"),rset.getString("job"),rset.getLong("mgr"),rset.getDate("hiredate")
						,rset.getDouble("sal"),rset.getDouble("comm"),rset.getLong("deptno")));
				
			}
			
		} catch (ClassNotFoundException e) {
			//CLASS ERROR
			e.printStackTrace();
		} catch (SQLException e) {
			//DB CON ERROR
			e.printStackTrace();
		}
		finally {
			try {
				
			if(rset!=null)rset.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			}catch(SQLException e) {}
		}
		
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
	}
	public static void Func2(Connection conn,PreparedStatement pstmt,ResultSet rset,ArrayList<Emp> emplist) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@"+DB_IP+ ":"+DB_PORT+"/xe",
					DB_ID,DB_PW);
			
			String input="";
			System.out.println("검색할거입력해 1개만일단");
			Scanner sc = new Scanner(System.in);
			input=sc.next();
			
			String query="select "+input+" from emp";
			pstmt=conn.prepareStatement(query);
			
			rset=pstmt.executeQuery();
			
			//, 있으면 분리해서 여러줄만큼반복출력하면되겠네~
			while(rset.next()) {
				System.out.println(rset.getString(input));
				
			}
			
		} catch (ClassNotFoundException e) {
			//CLASS ERROR
			e.printStackTrace();
		} catch (SQLException e) {
			//DB CON ERROR
			e.printStackTrace();
		}
		finally {
			try {
				
			if(rset!=null)rset.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			}catch(SQLException e) {}
		}
		
		
	}
	public static void Func3(Connection conn,PreparedStatement pstmt,ResultSet rset,ArrayList<Emp> emplist) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@"+DB_IP+ ":"+DB_PORT+"/xe",
					DB_ID,DB_PW);
			
			Emp tmp =new Emp();
			String inputS="";
			int inputI=0;
			System.out.println("INSERT 할 EMPNO(숫자)");
			Scanner sc = new Scanner(System.in);
			inputI=sc.nextInt();
			tmp.setEmpNo(inputI);
			System.out.println("INSERT 할 ENAME(글자)");
			inputS=sc.next();
			tmp.setEname(inputS);
			System.out.println("INSERT 할 JOB(글자)");
			inputS=sc.next();
			tmp.setJob(inputS);
			System.out.println("INSERT 할 MGR(숫자)");
			inputI=sc.nextInt();
			tmp.setMgr((long)inputI);
			System.out.println("INSERT 할 DATE(아무거나입력,그냥20251010로함)");
			tmp.setHireDate(new Date(2025,10,10));
			System.out.println("INSERT 할 SAL(숫자)");
			inputI=sc.nextInt();
			tmp.setSal((double) inputI);
			System.out.println("INSERT 할 COMM(숫자)");
			inputI=sc.nextInt();
			tmp.setComm((double) inputI);
			System.out.println("INSERT 할 DEPTNO(숫자)");
			inputI=sc.nextInt();
			tmp.setDeptNo((long)inputI);
			
			String query="INSERT INTO EMP VALUES ("+tmp.getEmpNo()+", \'"+tmp.getEname()+"\', \'"+tmp.getJob()+"\', "+tmp.getMgr()+", '"+tmp.getHireDate()+"\', "
					+tmp.getSal()+", "+tmp.getComm()+", "+tmp.getDeptNo()+")";
			pstmt=conn.prepareStatement(query);
			rset=pstmt.executeQuery();
			
			
			
			
		} catch (ClassNotFoundException e) {
			//CLASS ERROR
			e.printStackTrace();
		} catch (SQLException e) {
			//DB CON ERROR
			e.printStackTrace();
		}
		finally {
			try {
				
			if(rset!=null)rset.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			}catch(SQLException e) {}
		}
		
		
	}
	public static void Func4(Connection conn,PreparedStatement pstmt,ResultSet rset,ArrayList<Emp> emplist) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@"+DB_IP+ ":"+DB_PORT+"/xe",
					DB_ID,DB_PW);
			
			int input=0;
			System.out.println("삭제할 EMPNO입력");
			Scanner sc = new Scanner(System.in);
			input=sc.nextInt();
			
			String query="DELETE FROM emp WHERE empno="+input;
			pstmt=conn.prepareStatement(query);
			rset=pstmt.executeQuery();
			
			
		} catch (ClassNotFoundException e) {
			//CLASS ERROR
			e.printStackTrace();
		} catch (SQLException e) {
			//DB CON ERROR
			e.printStackTrace();
		}
		finally {
			try {
				
			if(rset!=null)rset.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			}catch(SQLException e) {}
		}
		
		
	}
	public static void Func5(Connection conn,PreparedStatement pstmt,ResultSet rset,ArrayList<Emp> emplist) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@"+DB_IP+ ":"+DB_PORT+"/xe",
					DB_ID,DB_PW);
			
			String inputColumn="";
			String inputValue="";
			int inputCondition=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("UPDATE할 COLUMN 입력");
			inputColumn=sc.next();
			System.out.println("UPDATE할 VALUE 입력");
			inputValue=sc.next();
			System.out.println("사원 번호 입력");
			inputCondition=sc.nextInt();
//			System.out.println("UPDATE할 VALUE 입력");
//			inputValue=sc.next();
//			System.out.println("WHERE CONDITION 입력");
//			inputCondition=sc.next();
//			
//			String query="UPDATE emp SET "+inputValue+"=\'"+inputColumn+"\' WHERE ";
			String query="UPDATE emp SET "+inputColumn+"=\'"+inputValue+"\' WHERE empno="+inputCondition;
			
			pstmt=conn.prepareStatement(query);
			rset=pstmt.executeQuery();
			
			
		} catch (ClassNotFoundException e) {
			//CLASS ERROR
			e.printStackTrace();
		} catch (SQLException e) {
			//DB CON ERROR
			e.printStackTrace();
		}
		finally {
			try {
				
			if(rset!=null)rset.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
			}catch(SQLException e) {}
		}
		
		
	}
	
}
class Emp{
	
	private int EmpNo;
	private String Ename;
	private String Job;
	private Long Mgr;
	private Date HireDate;
	private Double Sal; //Not NULL=double
	private Double Comm; //NULLABLE=Double
	private Long DeptNo;
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public Long getMgr() {
		return Mgr;
	}
	public void setMgr(Long mgr) {
		Mgr = mgr;
	}
	public Date getHireDate() {
		return HireDate;
	}
	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}
	public Double getSal() {
		return Sal;
	}
	public void setSal(Double sal) {
		Sal = sal;
	}
	public Double getComm() {
		return Comm;
	}
	public void setComm(Double comm) {
		Comm = comm;
	}
	public Long getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(Long deptNo) {
		DeptNo = deptNo;
	}
	public Emp() {}
	public Emp(int empNo, String ename, String job, Long mgr, Date hireDate, Double sal, Double comm, Long deptNo) {
		super();
		EmpNo = empNo;
		Ename = ename;
		Job = job;
		Mgr = mgr;
		HireDate = hireDate;
		Sal = sal;
		Comm = comm;
		DeptNo = deptNo;
	}
	
	@Override
	public String toString() {
		return "Emp [EmpNo=" + EmpNo + ", Ename=" + Ename + ", Job=" + Job + ", Mgr=" + Mgr + ", HireDate=" + HireDate
				+ ", Sal=" + Sal + ", Comm=" + Comm + ", DeptNo=" + DeptNo + "]";
	}
	
	
	
}