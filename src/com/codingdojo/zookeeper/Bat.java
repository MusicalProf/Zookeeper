package com.codingdojo.zookeeper;

public class Bat extends Mammal {
  public Bat(int energyLevel) {
    super(energyLevel);
  }

  public void fly() {
    System.out.println("WHOOSH!");
    energyLevel -= 50;
  }

  public void eatHumans() {
    System.out.println("YIKES! It's Attacking and eating people!!");
    energyLevel += 25;
  }

  public void attackTown() {
    System.out.println("CRACKLING");
  }
}
