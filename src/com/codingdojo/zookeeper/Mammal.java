package com.codingdojo.zookeeper;

public class Mammal {
  protected int energyLevel = 100;

  public Mammal(int energyLevel) {
    this.energyLevel = energyLevel;
  }

  public int displayEnergy() {
    System.out.println("Energy Level: " + energyLevel);
    return energyLevel;
  }
}
