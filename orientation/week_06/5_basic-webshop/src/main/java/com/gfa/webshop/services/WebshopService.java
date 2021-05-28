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

  List<String> logToList;
  private final LogService logService;
  private final WebshopRepository webshopRepository;

  @Autowired
  public WebshopService(WebshopRepository webshopRepository, LogService logService) {
    this.webshopRepository = webshopRepository;
    this.logService = logService;
  }

  public void filterService(FilterQueryHolder filterQueryHolder) {

    Comparator<Item> orderByComparator = getItemComparator(filterQueryHolder);
    Predicate<Item> searchByPredicate = getSearchByPredicate(filterQueryHolder);
    Predicate<Item> availableOnlyPredicate = getAvailableOnlyPredicate(filterQueryHolder);

    webshopRepository.setItemsFiltered(
        webshopRepository.getItemsMain()
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
    webshopRepository.setItemsFiltered(webshopRepository.getItemsMain());
  }

}
