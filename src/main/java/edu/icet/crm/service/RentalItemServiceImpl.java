package edu.icet.crm.service;

import edu.icet.crm.dto.Item;
import edu.icet.crm.dto.RentalItem;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.entity.ItemEntity;
import edu.icet.crm.entity.RentalItemEntity;
import edu.icet.crm.repository.ItemRepository;
import edu.icet.crm.repository.RentalItemRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalItemServiceImpl implements RentalItemService {

    final RentalItemRepository rentalItemRepository;
    final ModelMapper mapper;


    @Override
    public void addRentalItem(RentalItem rentalItem) {
        rentalItemRepository.save(mapper.map(rentalItem, RentalItemEntity.class));

    }

    @Override
    public void deleteRentalItem(Integer id) {
        rentalItemRepository.deleteById(id);

    }

    @Override
    public RentalItem searchRentalItem(Integer id) {
        return mapper.map(rentalItemRepository.findById(id), RentalItem.class);

    }

    @Override
    public List<RentalItem> getAllRentalItem() {
        ArrayList<RentalItem> rentalItemArrayList = new ArrayList<>();
        rentalItemRepository.findAll().forEach(rentalItemEntity -> {
            rentalItemArrayList.add(mapper.map(rentalItemEntity, RentalItem.class));
        });
        return rentalItemArrayList;
    }

    @Override
    public void updateRentalItem(RentalItem rentalItem) {
        rentalItemRepository.save(mapper.map(rentalItem, RentalItemEntity.class));
    }
}
