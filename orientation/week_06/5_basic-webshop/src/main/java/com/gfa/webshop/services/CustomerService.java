package com.gfa.webshop.services;

import com.gfa.webshop.models.Item;
import com.gfa.webshop.repositorys.WebshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  private final WebshopRepository webshopRepository;

  @Autowired
  public CustomerService(WebshopRepository webshopRepository) {
    this.webshopRepository = webshopRepository;
  }

  public void buyService(int index) {
    for (Item item : webshopRepository.getItemsMain()) {
      if (item.getId() == index && item.getStock() > 0) {
        item.setStock(item.getStock() - 1);
        webshopRepository.setBalance(webshopRepository.getBalance() - item.getPrice());
      }
    }
  }

}
