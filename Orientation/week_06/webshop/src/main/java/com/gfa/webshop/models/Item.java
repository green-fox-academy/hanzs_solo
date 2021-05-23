package com.gfa.webshop.models;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Item {

  private static AtomicInteger idGenerator = new AtomicInteger();

  private String name;
  private String description;
  private int price;
  private int stock;
  private int id;

  public Item(String name, String description, int price, int stock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.stock = stock;
    id = idGenerator.getAndIncrement();
  }

  @Override
  public String toString() {
    return "name: " + name + "description: " + description + "price: " + "stock: " + stock + "id: "
        + id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
}
