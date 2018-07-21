package com.cg.pizzaorder.bean;

public class Customer {

	private int customerId;
	private String CustName;
	private String address;
	private String phone;

	public Customer(String custName2, String address2, String phone2) {
		this.customerId = 00;
		this.CustName = custName2;
		this.address = address2;
		this.phone = phone2;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", CustName=" + CustName + ", address=" + address + ", phone="
				+ phone + "]";
	}

}
