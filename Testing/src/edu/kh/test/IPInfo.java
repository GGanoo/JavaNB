package edu.kh.test;

public class IPInfo {
	private String ip;
	private String user;
	
	public IPInfo() {}    //void?
	public IPInfo(String ip, String user) {
		this.ip = ip;
		this.user = user;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return ip + " / " + user;
	}
	
}
