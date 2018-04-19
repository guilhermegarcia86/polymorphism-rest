package br.com.exemplo.polimorfismorest.model;

public class Dog extends Animal {
	
	private String bark;
	
	@Override
	public String toString() {
		return "I am dog";
	}

	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

}
