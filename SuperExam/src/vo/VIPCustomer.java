package vo;

public class VIPCustomer extends Customer {
		private int agentID;
		private double saleRatio;
		public int getAgentID() {
			return agentID;
		}
		public void setAgentID(int agentID) {
			this.agentID = agentID;
		}
		public double getSaleRatio() {
			return saleRatio;
		}
		public void setSaleRatio(double saleRatio) {
			this.saleRatio = saleRatio;
		}
		
		public VIPCustomer() {
			super();
			System.out.println("VIPCustomer() 호출됨");
			
		}
		public VIPCustomer(int agentID, double saleRatio)
			super("abc");
		this.agentID = agentID
		
}
