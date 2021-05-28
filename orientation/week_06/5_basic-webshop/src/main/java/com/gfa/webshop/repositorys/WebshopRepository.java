package com.gfa.webshop.repositorys;

import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.models.Item;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class WebshopRepository {

  private List<Item> itemsMain;
  private List<Item> itemsFiltered;
  private long balance;

  private FilterQueryHolder defaultFilterQuery;
  private FilterQueryHolder lastFilterQuery;
  private Item itemAutoFill;

  public WebshopRepository() {
    itemsMain = new ArrayList<>();
    fillItemsMain();
    itemsFiltered = itemsMain;
    balance = 2200;

    defaultFilterQuery = new FilterQueryHolder("", null, "price", null, null);
    lastFilterQuery = defaultFilterQuery;
  }

  private void fillItemsMain() {
    itemsMain.add(new Item("bread", "delicious white bread", 2, 6));
    itemsMain.add(new Item("nike shoes", "colorful nike shoes", 80, 1));
    itemsMain.add(new Item("coffee beans", "green coffee beans from Kenya", 30, 7));
    itemsMain.add(new Item("cuban cigar", "authentic cuban cigar", 50, 17));
    itemsMain.add(new Item("bottle of water", "regular mineral water", 1, 12));
    itemsMain.add(new Item("alarm clock", "a brand new alarm clock", 4, 1));
    itemsMain.add(new Item("cataflam", "a strong painkiller", 6, 5));
    itemsMain.add(new Item("chewing gum", "chewing gum for kids", 1, 8));
    itemsMain.add(new Item("condoms x3", "chewing gum not for kids", 3, 16));
    itemsMain.add(new Item("hoodie", "a green hoodie with a fox", 12, 4));
  }


  //getters and setters
  public List<Item> getItemsMain() {
    return itemsMain;
  }

  public void setItemsMain(List<Item> itemsMain) {
    this.itemsMain = itemsMain;
  }

  public List<Item> getItemsFiltered() {
    return itemsFiltered;
  }

  public void setItemsFiltered(List<Item> itemsFiltered) {
    this.itemsFiltered = itemsFiltered;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public FilterQueryHolder getDefaultFilterQuery() {
    return defaultFilterQuery;
  }

  public void setDefaultFilterQuery(FilterQueryHolder defaultFilterQuery) {
    this.defaultFilterQuery = defaultFilterQuery;
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
}
