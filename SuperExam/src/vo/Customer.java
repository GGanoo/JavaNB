package vo;

public class Customer {

	private int customerID;
	private String customerName;
	private String customerGrade;
	private int bounsPoint;
	private double bonusRatio;
	
	public Customer() {
		System.out.println("customer 생성자 호출됨");}
	
	public Customer(String customerName) {
		System.out.println("파라미터 받는 생성자 호출됨");
		this.customerName = customerName;
	}
//	public Customer(int customerID, String customerName, String customerGrade, int bounsPoint, double bonusRatio) {
//	
//	this.customerID = customerID;
//	this.customerName = customerName;
//	this.customerGrade = customerGrade;
//	this.bounsPoint = bounsPoint;
//	this.bonusRatio = bonusRatio;
//}
	


	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBounsPoint() {
		return bounsPoint;
	}

	public void setBounsPoint(int bounsPoint) {
		this.bounsPoint = bounsPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bounsPoint=" + bounsPoint + ", bonusRatio=" + bonusRatio + "]";
	}

	
	
	
}
