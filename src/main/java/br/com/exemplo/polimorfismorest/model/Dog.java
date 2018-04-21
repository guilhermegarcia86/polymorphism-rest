package br.com.exemplo.polimorfismorest.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Dog")
public class Dog extends Animal {
	
	private String bark;
	
	@Override
	public String toString() {
		return "Sou um doggo e meu nome é " + this.getName() + " e faço " + this.getBark() ;
	}

	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

}
