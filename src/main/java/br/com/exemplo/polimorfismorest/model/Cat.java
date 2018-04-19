package br.com.exemplo.polimorfismorest.model;

public class Cat extends Animal {
	
	private String meow;
	
	@Override
	public String toString() {
		return "I am cat";
	}

	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		this.meow = meow;
	}

}
