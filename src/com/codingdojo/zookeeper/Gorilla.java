package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
  public Gorilla(int energyLevel) {
    super(energyLevel);
  }

  public void throwSomething() {
    System.out.println("The gorilla threw something at the patron!");
    energyLevel -= 5;
  }

  public void eatBananas() {
    System.out.println("The gorilla was hungry, so they ate some bananas.");
    energyLevel += 10;
  }

  public void climb() {
    System.out.println("The gorilla climbed a tree.");
    energyLevel -= 10;
  }
}
