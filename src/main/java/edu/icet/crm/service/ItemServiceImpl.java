package edu.icet.crm.service;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.dto.Item;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.entity.ItemEntity;
import edu.icet.crm.repository.CustomerRepository;
import edu.icet.crm.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    final ItemRepository repository_item;
    final ModelMapper mapper;



    @Override
    public void addItem(Item item) {

        repository_item.save(mapper.map(item, ItemEntity.class));

    }

    @Override
    public void deleteItem(Integer id) {
        repository_item.deleteById(id);

    }

    @Override
    public Item searchItem(Integer id) {
        return mapper.map(repository_item.findById(id), Item.class);
    }

    @Override
    public List<Item> getAllItem() {

        ArrayList<Item> itemArrayList = new ArrayList<>();
        repository_item.findAll().forEach(itemEntity -> {
            itemArrayList.add(mapper.map(itemEntity, Item.class));
        });
        return itemArrayList;

    }

    @Override
    public void updateItem(Item item) {
        repository_item.save(mapper.map(item, ItemEntity.class));
    }
}
