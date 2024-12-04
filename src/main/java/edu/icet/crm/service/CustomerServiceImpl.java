package edu.icet.crm.service;

import edu.icet.crm.dto.Customer;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

   final CustomerRepository repository;
   final ModelMapper mapper;



    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));

    }

    @Override
    public void deleteCustomer(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public Customer searchById(Integer id) {
      return mapper.map(repository.findById(id), Customer.class);
    }

    @Override
    public List<Customer> getAll() {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        repository.findAll().forEach(customerEntity -> {
            customerArrayList.add(mapper.map(customerEntity, Customer.class));
        });
      return customerArrayList;

    }

    @Override
    public void updateCustomer(Customer customer) {
  repository.save(mapper.map(customer, CustomerEntity.class));
    }
}
