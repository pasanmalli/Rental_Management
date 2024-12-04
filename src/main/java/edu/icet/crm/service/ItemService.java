package edu.icet.crm.service;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.dto.Item;

import java.util.List;

public interface ItemService {

    void addItem(Item item );
    void deleteItem(Integer id);
    Item searchItem(Integer id);
    List<Item> getAllItem();
    void updateItem(Item item);



}
