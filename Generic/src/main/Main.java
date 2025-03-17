package main;

import java.util.ArrayList;

import vo.Plastic;
import vo.Powder;
import vo.ThreeDPrinter;

public class Main {

	public static void main(String[] args) {
		
//		ThreeDPrinter p1 = new ThreeDPrinter();
//		Powder p = new Powder();
//		p1.setMaterial(p);
//		
//		Powder pp = (Powder) p1.getMaterial();
		ThreeDPrinter<Powder> p1 = new ThreeDPrinter<Powder>();
		Powder p = new Powder();
		p1.setMaterial(p);
		Powder pp =  p1.getMaterial();
		
		ThreeDPrinter<Plastic> p2 = new ThreeDPrinter<Plastic>();
		Plastic ps = new Plastic();
		p2.setMaterial(ps);;
		Plastic pss = p2.getMaterial();
		
		ArrayList list = new ArrayList();
		ThreeDPrinter t = new ThreeDPrinter();
		
	
	
	
	
	}

}
