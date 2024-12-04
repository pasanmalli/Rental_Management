package edu.icet.crm.controller;

import edu.icet.crm.dto.Item;
import edu.icet.crm.dto.RentalItem;
import edu.icet.crm.service.ItemService;
import edu.icet.crm.service.RentalItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalController {

    private final RentalItemService rentalItemService;


    @PostMapping("/add-rental-item")
    public void addRentalItem(@RequestBody RentalItem rentalItem) {
        rentalItemService.addRentalItem(rentalItem);

        ;

    }
    @PutMapping("/update-rental-item")
    public void updateRentalItem(@RequestBody RentalItem rentalItem) {

        rentalItemService.updateRentalItem(rentalItem);
    }
    @DeleteMapping("/delete-rental-item/{id}")
    public void deleteRentalItem(@PathVariable Integer id) {
        service.deleteItem(id);
    }
    @GetMapping("/search-item/{id}")
    public Item searchItem(@PathVariable Integer id) {

        return service.searchItem(id);

    }
    @GetMapping("/find-all")
    public List<Item> getAll() {


        return service.getAllItem();


    }




}
