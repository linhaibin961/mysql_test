package com.lhb.bean;

public class Topic {

	public Topic() {
	}

	public Topic(Integer id) {
		this.id = id;
	}

	private Integer id;
	private String message;
	public Integer getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMessage(String message) {
		this.message = message;
	}



}
