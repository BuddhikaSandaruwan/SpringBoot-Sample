package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class CustomerDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;
    private String custName;
    private String custAddress;
    private double salary;

    public CustomerDTO() {
    }

    public CustomerDTO( String custName, String custAddress, double salary) {
        this.custName = custName;
        this.custAddress = custAddress;
        this.salary = salary;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
