package com.lottoland.springboot.web.app.models;

public class Resume {

	private String label;
	private long value;
	
	
	public Resume(String label, long value) {
		super();
		this.label = label;
		this.value = value;
	}


	public String getLabel() {
		return label;
	}


	public long getValue() {
		return value;
	}
	
	
	
}
