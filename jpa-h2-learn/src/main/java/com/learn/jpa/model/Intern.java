package com.learn.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Intern {
	
	@Id
	private int internId;
	private String internName;
	private String internMail;
	public String getInternName() {
		return internName;
	}
	public void setInternName(String internName) {
		this.internName = internName;
	}
	public int getInternId() {
		return internId;
	}
	public void setInternId(int internId) {
		this.internId = internId;
	}
	public String getInternMail() {
		return internMail;
	}
	public void setInternMail(String internMail) {
		this.internMail = internMail;
	}
	@Override
	public String toString() {
		return "Intern [internName=" + internName + ", internId=" + internId + ", internMail=" + internMail + "]";
	}
	
	

}
