package com.example.demo.services.impl;

import com.example.demo.domain.CustomerDTO;
import com.example.demo.domain.UserDTO;
import com.example.demo.repository.CustomerRepo;
import com.example.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public List<CustomerDTO> findAllCustomers() throws Exception {
        return customerRepo.findAll();
    }

    @Override
    public String saveCustomer(CustomerDTO customerDTO) throws Exception {
        customerRepo.save(customerDTO);
        return "Data save";
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(int custID) throws Exception {
//         customerRepo.delete(custID);
         return true;
    }
}
