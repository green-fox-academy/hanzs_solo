package com.gfa.webshop.services;

import com.gfa.webshop.models.FilterQueryHolder;
import com.gfa.webshop.models.Item;
import com.gfa.webshop.repositorys.WebshopRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DataService {

  private final WebshopRepository webshopRepository;

  //methods
  public List<Item> getItemsFiltered() {
    return webshopRepository.getItemsFiltered();
  }

  public long getBalance() {
    return webshopRepository.getBalance();
  }

  public FilterQueryHolder getDefaultFilterQuery() {
    return webshopRepository.getDefaultFilterQuery();
  }

  public FilterQueryHolder getLastFilterQuery() {
    return webshopRepository.getLastFilterQuery();
  }

  public void setLastFilterQuery(FilterQueryHolder lastFilterQuery) {
    webshopRepository.setLastFilterQuery(lastFilterQuery);
  }

  public Item getItemAutoFill() {
    return webshopRepository.getItemAutoFill();
  }

}
