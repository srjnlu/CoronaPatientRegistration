package com.nt.bo;

public class PatientBO {
	private String name;
	private String address;
	private String mob;
	private Integer daysCount;
	private Float amount;
	private Float bill;
	private Float discount;
	private Float netBill;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public Integer getDaysCount() {
		return daysCount;
	}

	public void setDaysCount(Integer daysCount) {
		this.daysCount = daysCount;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Float getBill() {
		return bill;
	}

	public void setBill(Float bill) {
		this.bill = bill;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Float getNetBill() {
		return netBill;
	}

	public void setNetBill(Float netBill) {
		this.netBill = netBill;
	}
}
