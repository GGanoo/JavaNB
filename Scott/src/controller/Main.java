package controller;

import java.util.List;

import dao.EmpDAO;
import vo.EmpVO;

public class Main {
	
	public static void main(String[] args) {
		
		List<EmpVO> list = EmpDAO.selectList();
		for (EmpVO item : list) {
			System.out.println(item.toString());
		}
		
	}

}
