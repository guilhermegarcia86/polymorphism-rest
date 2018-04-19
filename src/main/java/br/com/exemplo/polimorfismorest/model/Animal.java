package br.com.exemplo.polimorfismorest.model;

public abstract class Animal {

	private String name;
	
	@Override
	public String toString() {
		return "I am generic animal";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
