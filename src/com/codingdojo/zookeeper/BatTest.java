package com.codingdojo.zookeeper;

public class BatTest {
  public static void main(String[] args) {
    Bat barry = new Bat(300);

    for (int i = 0; i < 3; i++) {
      barry.attackTown();
    }
    for (int i = 0; i < 2; i++) {
      barry.fly();
      barry.eatHumans();
    }

    barry.displayEnergy();
  }
}
