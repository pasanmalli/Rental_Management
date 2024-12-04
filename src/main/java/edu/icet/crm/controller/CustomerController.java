package edu.icet.crm.controller;


import edu.icet.crm.dto.Customer;
import edu.icet.crm.service.CustomerService;
import edu.icet.crm.service.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
@RequiredArgsConstructor

public class CustomerController {

    private final CustomerService service;


    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer) {
     service.addCustomer(customer);

    }
    @PutMapping("/update-customer")
    public void updateCustomer(@RequestBody Customer customer) {

        service.updateCustomer(customer);
    }
   @DeleteMapping("/delete-customer/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        service.deleteCustomer(id);
    }
   @GetMapping("/search-by-id/{id}")
    public Customer searchCustomer(@PathVariable Integer id) {

        return service.searchById(id);

    }
@GetMapping("/find-all")
    public List<Customer> getAll() {


        return service.getAll();


    }


}
