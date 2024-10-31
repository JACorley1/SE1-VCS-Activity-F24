package edu.westga.cs3211.zodiac_animals.model;

public class Pig {
	int age;
	int size;
	
	public Pig(int age, int size) {
		this.setAge(age);
		this.setSize(size);
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Pig cannot be younger than 0.");
		}
		
		this.age = age;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int size) {	
		if (size < 0) {
			throw new IllegalArgumentException("Pig cannot be smaller than 0.");
		}
		
		this.size = size;
	}
}
