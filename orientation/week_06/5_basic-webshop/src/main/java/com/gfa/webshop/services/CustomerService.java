package com.gfa.webshop.services;

import com.gfa.webshop.models.Item;
import com.gfa.webshop.repositorys.WebshopRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

  private final WebshopRepository webshopRepository;

  public void buyItem(int index) {
    for (Item item : webshopRepository.getItemsMain()) {
      if (item.getId() == index && item.getStock() > 0) {
        item.setStock(item.getStock() - 1);
        webshopRepository.setBalance(webshopRepository.getBalance() - item.getPrice());
      }
    }
  }
}
