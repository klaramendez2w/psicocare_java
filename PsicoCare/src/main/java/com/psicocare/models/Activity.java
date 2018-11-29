package com.psicocare.models;

public class Activity {
	private int aid;
	private String statement;
	private String value;
	
	
	public Activity(int aid, String statement, String value) {
		super();
		this.aid = aid;
		this.statement = statement;
		this.value = value;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	


}
