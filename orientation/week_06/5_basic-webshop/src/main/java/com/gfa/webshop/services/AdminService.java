package com.gfa.webshop.services;

import com.gfa.webshop.models.Item;
import com.gfa.webshop.repositorys.WebshopRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminService {

  private final WebshopRepository webshopRepository;
  private final WebshopService webshopService;

  public boolean verifyAdminPass(String password) {
    webshopService.resetFilters();
    return password.equals("admin");
  }

  public void addItem(Item newItem) {
    List<Item> newList = webshopRepository.getItemsMain();
    newList.add(new Item(newItem.getName(), newItem.getDescription(),
        newItem.getPrice(), newItem.getStock()));
    webshopRepository.setItemsMain(newList);
  }

  public boolean removeItem(int id) {
    List<Item> newInitialList = webshopRepository.getItemsMain();
    List<Item> newFilteredList = webshopRepository.getItemsMain();
    for (int i = 0; i < newFilteredList.size(); i++) {
      if (newFilteredList.get(i).getId() == id) {
        newFilteredList.remove(i);
        webshopRepository.setItemsFiltered(newFilteredList);
        break;
      }
    }
    for (int i = 0; i < newInitialList.size(); i++) {
      if (newInitialList.get(i).getId() == id) {
        newInitialList.remove(i);
        webshopRepository.setItemsMain(newInitialList);
        return true;
      }
    }
    return false;
  }

  public boolean modifyItem(Item newItem) {
    List<Item> newList = webshopRepository.getItemsMain();

    for (int i = 0; i < newList.size(); i++) {
      if (newList.get(i).getId() == newItem.getId()) {
        newList.set(i, newItem);
        webshopRepository.setItemAutoFill(null);
        webshopRepository.setItemsMain(newList);
        return true;
      }
    }
    webshopRepository.setItemAutoFill(null);
    return false;
  }

  public void autoFillCurrentValues(Integer id) {
    if (id == null) {
      webshopRepository.setItemAutoFill(null);
      return;
    }
    for (Item item : webshopRepository.getItemsMain()) {
      if (item.getId() == id) {
        webshopRepository.setItemAutoFill(item);
        return;
      }
    }
    webshopRepository.setItemAutoFill(null);
  }
}
