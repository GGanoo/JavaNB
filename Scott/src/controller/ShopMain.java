package controller;

import java.util.List;

import dao.ShopDAO3;
import vo.ShopMember;

public class ShopMain {

	public static void main(String[] args) {
		
		List<ShopMember> list = ShopDAO3.selectList();
		for (ShopMember item : list) {
			System.out.println(item.toString());
	}
	}
}
