package com.nt.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable{
	private String name;
	private String address;
	private String mob;
	private Integer daysCount;
	private Float amount;

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

	@Override
	public String toString() {
		return "PatientDTO [name=" + name + ", address=" + address + ", mob=" + mob + ", daysCount=" + daysCount
				+ ", amount=" + amount + "]";
	}

}
