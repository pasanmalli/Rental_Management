package edu.icet.crm.service;

import edu.icet.crm.dto.Customer;

import java.util.List;

public interface CustomerService {

void addCustomer(Customer customer );
void deleteCustomer(Integer id);
Customer searchById(Integer id);
List<Customer> getAll();
void updateCustomer(Customer customer);



}
