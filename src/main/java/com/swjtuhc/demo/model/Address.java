package com.swjtuhc.demo.model;

public class Address {
	private int aId;
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
		return "Address [aId=" + aId + ", address=" + address + "]";
	}

	
}
