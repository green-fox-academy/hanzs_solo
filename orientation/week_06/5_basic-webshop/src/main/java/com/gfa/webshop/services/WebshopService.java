package com.gfa.webshop.services;

import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.models.Item;
import com.gfa.webshop.repositorys.WebshopRepository;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WebshopService {

  private final WebshopRepository webshopRepository;

  public void filterItems(FilterQueryHolder filterQueryHolder) {

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

  public void resetFilters() {
    webshopRepository.setItemsFiltered(webshopRepository.getItemsMain());
  }

}
