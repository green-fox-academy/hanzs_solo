package com.gfa.webshop.models;

import java.util.concurrent.atomic.AtomicInteger;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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

//  @Override
//  public String toString() {
//    return "name: " + name + "description: " + description
//        + "price: " + price + "stock: " + stock + "id: " + id;
//  }
}
