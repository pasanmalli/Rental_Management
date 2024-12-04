package edu.icet.crm.repository;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
}
