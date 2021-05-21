package com.gfa.bankofsimba.modules;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {
  private static AtomicLong indexGenerator = new AtomicLong();

  private long index;
  private String name;
  private int balance;
  private String animalType;

  public BankAccount(String name, int balance, String animalType) {
    index = indexGenerator.getAndIncrement();
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  @Override
  public String toString() {
    return "|index: " + index + "|name: " + name
        + " |balance: " + balance + " |animalType: "
        + animalType;
  }

  public long getIndex() {
    return index;
  }

  public void setIndex(long index) {
    this.index = index;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
