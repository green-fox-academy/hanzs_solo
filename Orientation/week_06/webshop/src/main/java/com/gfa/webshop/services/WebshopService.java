package com.gfa.webshop.services;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.models.Item;
import com.gfa.webshop.repositorys.WebshopRepository;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebshopService {

  List<String> logList;
  WebshopRepository webshopRepository;

  @Autowired
  public WebshopService(WebshopRepository webshopRepository) {
    logList = new ArrayList<>();
    logList.add("");
    this.webshopRepository = webshopRepository;
  }

  public List<Item> forwardItemsInitial() {
    return webshopRepository.getItemsInitial();
  }

  public List<Item> forwardItemsFiltered() {
    return webshopRepository.getItemsFiltered();
  }

  public long forwardBalance() {
    return webshopRepository.getBalance();
  }

  public Item forwardItemById(int id) {
    for (Item item : webshopRepository.getItemsInitial()) {
      if (item.getId() == id) {
        return item;
      }
    }
    return null;
  }

//  public Item forwardEmptyItem(){
//    return webshopRepository.getItemEmpty();
//  }

  public Item forwardAutoFillItem() {
    return webshopRepository.getItemAutoFill();
  }

  public void setItemAutofill(Item item) {
    webshopRepository.setItemAutoFill(item);
  }

  public void filterLogic(FilterQueryHolder filterQueryHolder) {

    Comparator<Item> orderByComparator = getItemComparator(filterQueryHolder);
    Predicate<Item> searchByPredicate = getSearchByPredicate(filterQueryHolder);
    Predicate<Item> availableOnlyPredicate = getAvailableOnlyPredicate(filterQueryHolder);

    webshopRepository.setItemsFiltered(
        webshopRepository.getItemsWithoutCart()
            .stream()
            .filter(searchByPredicate)
            .filter(availableOnlyPredicate)
            .sorted(orderByComparator)
            .collect(Collectors.toList())
    );
  }

  private Comparator<Item> getItemComparator(FilterQueryHolder filterQueryHolder) {
    Comparator<Item> orderByComparator = Comparator.comparingInt(Item::getPrice);
    switch (filterQueryHolder.getShortBy()) {
      case "price":
        orderByComparator = Comparator.comparingInt(Item::getPrice);
        break;
      case "name":
        orderByComparator = Comparator.comparing(Item::getName);
        break;
      case "quantity":
        orderByComparator = Comparator.comparingInt(Item::getStock);
    }

    if (filterQueryHolder.getIsDescending() != null) {
      orderByComparator = orderByComparator.reversed();
    }
    return orderByComparator;
  }

  private Predicate<Item> getSearchByPredicate(FilterQueryHolder filterQueryHolder) {
    Predicate<Item> searchByPredicate = x -> x.getName().contains(filterQueryHolder.getSearch());
    if (filterQueryHolder.getInDescription() != null) {
      searchByPredicate = x -> x.getName().contains(filterQueryHolder.getSearch())
          || x.getDescription().contains(filterQueryHolder.getSearch());
    }
    return searchByPredicate;
  }

  private Predicate<Item> getAvailableOnlyPredicate(FilterQueryHolder filterQueryHolder) {
    Predicate<Item> availableOnlyPredicate = x -> true;
    if (filterQueryHolder.getAvailableOnly() != null) {
      availableOnlyPredicate = x -> x.getStock() != 0;
    }
    return availableOnlyPredicate;
  }

  public void resetFiltersService() {
    webshopRepository.setItemsFiltered(webshopRepository.getItemsInitial());
  }

  public void buyService(int index) {
    for (Item item : webshopRepository.getItemsInitial()) {
      if (item.getId() == index && item.getStock() > 0) {
        item.setStock(item.getStock() - 1);
        webshopRepository.setBalance(webshopRepository.getBalance() - item.getPrice());
      }
    }
  }

  public String verifyPassService(HttpServletRequest request, String password) {
    if (!password.equals("admin")) {
      log(request.getRemoteAddr()
          + " tried to access admin mode with password: " + password
          + "  **ACCESS DENIED**"
      );
      return "access-denied";
    } else {
      log(request.getRemoteAddr()
          + " tried to access admin mode with password: " + password
          + "  **ACCESS GRANTED**"
      );
    }
    resetFiltersService();
    return "redirect:/admin-mode";
  }


  public void autoFillService(Integer id) {
    if (id == null) {
      webshopRepository.setItemAutoFill(null);
      return;
    }
    for (Item item : webshopRepository.getItemsInitial()) {
      if (item.getId() == id) {
        webshopRepository.setItemAutoFill(item);
        return;
      }
    }
    webshopRepository.setItemAutoFill(null);
  }

  public void modifyService(Item newItem) {
    List<Item> newList = webshopRepository.getItemsInitial();

    for (int i = 0; i < newList.size(); i++) {
      if (newList.get(i).getId() == newItem.getId()) {
        newList.set(i, newItem);
        webshopRepository.setItemsInitial(newList);
      }
    }
  }

  public void removeService(int id) {
    List<Item> newInitialList = webshopRepository.getItemsInitial();

    List<Item> newFilteredList = webshopRepository.getItemsInitial();
    for (int i = 0; i < newFilteredList.size(); i++) {
      if (newFilteredList.get(i).getId() == id) {
        newFilteredList.remove(i);
        webshopRepository.setItemsFiltered(newFilteredList);
        return;
      }
    }

    for (int i = 0; i < newInitialList.size(); i++) {
      if (newInitialList.get(i).getId() == id) {
        newInitialList.remove(i);
        webshopRepository.setItemsInitial(newInitialList);
        return;
      }
    }
  }


  public void addService(Item newItem) {

    List<Item> newList = webshopRepository.getItemsInitial();
    newList.add(new Item(newItem.getName(), newItem.getDescription(), newItem.getPrice(),
        newItem.getStock()));
    webshopRepository.setItemsInitial(newList);
  }

  public void log(String log) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    DateTimeFormatter dateTimeFormatterForPath = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
    Path logPath = Paths.get(
        "src/main/java/com/gfa/webshop/logs/logs_" + dateTimeFormatterForPath.format(now) + "txt");

    log = dateTimeFormatter.format(now) + " | " + log;
    tryToLog(log, logPath);

  }

  private void tryToLog(String log, Path logPath) {
    System.out.println(log);
    logList.set(0, log);
    if (!Files.exists(logPath)) {
      try {
        Files.createFile(logPath);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    try {
      Files.write(logPath, logList, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
