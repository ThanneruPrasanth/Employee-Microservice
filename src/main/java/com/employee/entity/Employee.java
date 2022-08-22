package com.employee.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private Long eId;
	private String name;
	private String phone;

	public List<Record> record = new ArrayList<>();

	public Long geteId() {
		return eId;
	}

	public void seteId(long eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Record> getRecord() {
		return record;
	}

	public void setRecord(List<Record> record) {
		this.record = record;
	}

	public Employee(Long eId, String name, String phone, List<Record> record) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
		this.record = record;
	}

	public Employee(Long eId, String name, String phone) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
	}

	public Employee() {
		super();
	}

}
