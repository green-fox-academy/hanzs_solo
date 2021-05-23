package com.gfa.webshop.controllers;

import com.gfa.webshop.models.Item;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  List<Item> initialItems = new ArrayList<>();
  List<Item> items = initialItems;
  List<Item> cart = new ArrayList<>();
  List<Item> filtered = initialItems;
  int wallet = 3500;

  public MainController() {
    initialItems.add(new Item("bread", "delicious white bread", 1, 12));
    initialItems.add(new Item("nike shoes", "colorful nike shoes", 100, 5));
    initialItems.add(new Item("coffee beans", "right from noth Africa", 30, 4));
    initialItems.add(new Item("cocaine", "100% columbian cocaine", 100, 14));
  }

  @GetMapping("/")
  public String main() {
    return "redirect:/webshop";
  }

  @GetMapping("/webshop")
  public String filered(Model model) {
    model.addAttribute("items", filtered);
    model.addAttribute("cart", cart);
    model.addAttribute("wallet", wallet);
    return "index";
  }

  @GetMapping("/reset")
  public String resetFilters() {
    filtered = items;
    return "redirect:/webshop";
  }

  @GetMapping("/sort")
  public String sort(
      @RequestParam String search,
      @RequestParam String shortBy,
      @RequestParam(defaultValue = "False") Boolean inDescription,
      @RequestParam(defaultValue = "False") Boolean descending,
      @RequestParam(defaultValue = "False") Boolean availableOnly) {

    Comparator<Item> c = Comparator.comparingInt(Item::getPrice);
    Predicate<Item> p = x -> true;
    Predicate<Item> s = x -> x.getName().contains(search);

    switch (shortBy) {
      case "price":
        c = Comparator.comparingInt(Item::getPrice);
        break;
      case "name":
        c = Comparator.comparing(Item::getName);
        break;
      case "quantity":
        c = Comparator.comparingInt(Item::getStock);
    }
    if (inDescription) {
      s = x -> x.getName().contains(search) || x.getDescription().contains(search);
      ;
    }

    if (descending) {
      c = c.reversed();
    }
    if (availableOnly) {
      p = x -> x.getStock() != 0;
    }

    filtered = filtered.stream()
        .filter(s)
        .filter(p)
        .sorted(c)
        .collect(Collectors.toList());

    return "redirect:/webshop";
  }

  @GetMapping("/buy/{index}")
  public String buy(@PathVariable int index) {
    for (Item item : items) {
      if (item.getId() == index && item.getStock() > 0) {
        boolean shouldAdd = true;
        for (Item asd : cart) {
          if (asd.getId() == index) {
            asd.setId(asd.getId() + 1);
            shouldAdd = false;
          }
        }
        if (shouldAdd) {
          cart.add(new Item(item.getName(), item.getDescription(),
                  item.getPrice(), item.getStock()));
          cart.get(cart.size() - 1).setStock(1);
          cart.get(cart.size() - 1).setId(index );
        }
        item.setStock(item.getStock() - 1);
        wallet -= item.getPrice();
      }
    }
    return "redirect:/webshop";
  }

  @GetMapping("/adminmode")
  public String adminMode(Model model) {
    return "verify";
  }

  @GetMapping("/verify")
  public String verify(@RequestParam String password, Model model) {
    System.out.println(password);
    if (!password.equals("admin")) {
      return "access-denied";
    }
    model.addAttribute("items", initialItems);
    return "modify";
  }

  @PostMapping("/modify")
  public String modify(@RequestParam int id, Item newItem, Model model) {
    newItem.setId(id);
    for (int i = 0; i < initialItems.size(); i++) {
      if (initialItems.get(i).getId() == newItem.getId()) {
        initialItems.set(i, newItem);
      }
    }
    model.addAttribute("items", initialItems);
    return "modify";
  }
}
