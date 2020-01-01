package com.swjtuhc.demo.model;

public class Address {
	private int aId;
	private String gamename;
	 public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", gamename=" + gamename + ", address=" + address + "]";
	}

	

	
}
