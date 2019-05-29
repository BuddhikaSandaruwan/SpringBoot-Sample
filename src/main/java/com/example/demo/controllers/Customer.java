package com.example.demo.controllers;

import com.example.demo.domain.CustomerDTO;
import com.example.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class Customer {
    @Autowired
    private CustomerServices customerServices;


    @GetMapping("/add")
    public String addCustomer(@RequestBody CustomerDTO customerDTO) throws Exception {
       return customerServices.saveCustomer(customerDTO);

    }
    @GetMapping("/all")
    public List<CustomerDTO> getAllCustomers() throws Exception {
        return customerServices.findAllCustomers();

    }
}
