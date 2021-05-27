package com.gfa.webshop.repositorys;

import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.models.Item;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class WebshopRepository {

  Item itemAutoFill;
  FilterQueryHolder lastFilterQuery;
  FilterQueryHolder defaultFilterQuery;

  List<Item> itemsInitial;
  List<Item> itemsFiltered;
  List<Item> itemsWithoutCart;
  List<Item> itemsCart;
  long balance;

  public WebshopRepository(){
    itemsInitial = new ArrayList<>();
    itemsInitial.add(new Item("bread", "delicious white bread", 1, 12));
    itemsInitial.add(new Item("nike shoes", "colorful nike shoes", 100, 5));
    itemsInitial.add(new Item("coffee beans", "right from noth Africa", 30, 4));
    itemsInitial.add(new Item("cocaine", "100% columbian cocaine", 100, 14));
    this.itemsFiltered = itemsInitial;
    this.itemsWithoutCart = itemsInitial;
    this.itemsCart = new ArrayList<>();
    balance = 2200;
  }

  public FilterQueryHolder getLastFilterQuery() {
    return lastFilterQuery;
  }

  public void setLastFilterQuery(FilterQueryHolder lastFilterQuery) {
    this.lastFilterQuery = lastFilterQuery;
  }

  public Item getItemAutoFill() {
    return itemAutoFill;
  }

  public void setItemAutoFill(Item itemAutoFill) {
    this.itemAutoFill = itemAutoFill;
  }


  public List<Item> getItemsInitial() {
    return itemsInitial;
  }

  public void setItemsInitial(List<Item> itemsInitial) {
    this.itemsInitial = itemsInitial;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public List<Item> getItemsWithoutCart() {
    return itemsWithoutCart;
  }

  public void setItemsWithoutCart(List<Item> itemsWithoutCart) {
    this.itemsWithoutCart = itemsWithoutCart;
  }

  public List<Item> getItemsCart() {
    return itemsCart;
  }

  public void setItemsCart(List<Item> itemsCart) {
    this.itemsCart = itemsCart;
  }

  public List<Item> getItemsFiltered() {
    return itemsFiltered;
  }

  public void setItemsFiltered(List<Item> itemsFiltered) {
    this.itemsFiltered = itemsFiltered;
  }
}
