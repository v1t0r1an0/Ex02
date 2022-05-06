package br.com.senai.guiVitoriano.application.model;

import javax.inject.Named;

@Named("Interreses")

public class Interesses {

	private Integer id;
	private String area;

	public Interesses(Integer id, String area) {
		super();
		this.id = id;
		this.area = area;
	}
	
	public Interesses() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}

