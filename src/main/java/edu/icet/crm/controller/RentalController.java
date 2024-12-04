package edu.icet.crm.controller;


import edu.icet.crm.dto.RentalItem;

import edu.icet.crm.service.RentalItemService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rental")
@CrossOrigin
@RequiredArgsConstructor
public class RentalController {

    private final RentalItemService rentalItemService;


    @PostMapping("/add-rental-item")
    public void addRentalItem(@RequestBody RentalItem rentalItem) {
        rentalItemService.addRentalItem(rentalItem);


    }
    @PutMapping("/update-rental-item")
    public void updateRentalItem(@RequestBody RentalItem rentalItem) {

        rentalItemService.updateRentalItem(rentalItem);
    }
    @DeleteMapping("/delete-rental-item/{id}")
    public void deleteRentalItem(@PathVariable Integer id) {
        rentalItemService.deleteRentalItem(id);
    }
    @GetMapping("/search-rental-item/{id}")
    public RentalItem searchRentalItem(@PathVariable Integer id) {

        return searchRentalItem(id);

    }
    @GetMapping("/find-all")
    public List<RentalItem> getAll() {


        return rentalItemService.getAllRentalItem();


    }




}
