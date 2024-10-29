package edu.westga.cs3211.zodiac_animals.model;

public class Chicken {

	private int ageOfPerson;
	private String nameOfPerson;
	
	public Chicken(int age, String name) {
		this.ageOfPerson = age;
		this.nameOfPerson = name;
	}
	
	public int getAgeOfPerson() {
		return this.ageOfPerson;
	}
	
	public String getNameOfPerson() {
		return this.nameOfPerson;
	}
}
