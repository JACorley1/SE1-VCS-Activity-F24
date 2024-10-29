package edu.westga.cs3211.zodiac_animals.model;

public class Goat {
  String name = "";
  int age = 0;
  String breed = "";

  public Goat(String name, int age, String breed){
    this.name = name;
    this.age = age;
    this.breed = breed;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public String getBreed(){
    return this.breed;
  }
}
