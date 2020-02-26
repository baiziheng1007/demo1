package com.bzh.entity;

public class Hello {
	private Integer id;
	private String name;
	@Override
	public String toString() {
		return "Hello [id=" + id + ", name=" + name + "]";
	}
	public Hello(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Hello() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
