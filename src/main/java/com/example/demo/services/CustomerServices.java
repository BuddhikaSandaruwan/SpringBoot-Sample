package com.example.demo.services;

import com.example.demo.domain.CustomerDTO;

import java.util.List;

public interface CustomerServices {
    public List<CustomerDTO> findAllCustomers()throws Exception;

    public String saveCustomer(CustomerDTO customerDTO)throws Exception;

    public boolean updateCustomer(CustomerDTO customerDTO)throws Exception;

    public boolean deleteCustomer(int custID)throws Exception;

}
