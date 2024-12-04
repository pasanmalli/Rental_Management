package edu.icet.crm.repository;

import edu.icet.crm.entity.RentalItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalItemRepository extends JpaRepository<RentalItemEntity,Integer> {
}
