package br.com.exemplo.polimorfismorest.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Cat")
public class Cat extends Animal {
	
	private String meow;
	
	@Override
	public String toString() {
		return "Sou um cat from hell e meu nome é " + this.getName() + " e faço " + this.getMeow();
	}

	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		this.meow = meow;
	}

}
