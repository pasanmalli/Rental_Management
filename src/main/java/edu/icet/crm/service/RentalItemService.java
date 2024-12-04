package edu.icet.crm.service;

import edu.icet.crm.dto.Item;
import edu.icet.crm.dto.RentalItem;

import java.util.List;

public interface RentalItemService {

    void addRentalItem(RentalItem rentalItem );
    void deleteRentalItem(Integer id);
    RentalItem searchRentalItem(Integer id);
    List<RentalItem> getAllRentalItem();
    void updateRentalItem(RentalItem rentalItem);




}
