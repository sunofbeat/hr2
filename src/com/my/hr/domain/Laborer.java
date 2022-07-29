package com.my.hr.domain;

import java.time.LocalDate;

public class Laborer {
	private int laborerId;
	private String name;
	private LocalDate regDate;
	
	public Laborer(int laborerId, String name, LocalDate regDate) {
		this.laborerId = laborerId;
		this.name = name;
		this.regDate = regDate;
	}

	public int getLaborerId() {
		return laborerId;
	}

	public String getName() {
		return name;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setLaborerId(int laborerId) {
		this.laborerId = laborerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return String.format("%3d %3s %8s", laborerId, name, regDate);
	}
}
