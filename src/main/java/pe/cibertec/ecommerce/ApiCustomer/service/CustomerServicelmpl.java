/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.cibertec.ecommerce.ApiCustomer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiCustomer.dao.CustomerRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

/**
 *
 * Clase especial cabron, no te olviden
 */
@Service
public class CustomerServicelmpl implements CustomerService{ 
    @Autowired
    private CustomerRepository CustomerRepository;
            
    @Override
    public List<Customer> findAll() {
      return (List<Customer>) CustomerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
       return  CustomerRepository.findById(id).orElse(null);
       }
    
   @Override 
    public Customer findByEmail(String email){
            return  CustomerRepository.findByEmail(email);
    }

    @Override
    public Customer findByPhone(String phone) {
        return CustomerRepository.findByPhone(phone);
    }

    @Override
    public Customer add(Customer customer) {
        return CustomerRepository.save(customer);
    }

    @Override
    public Customer update(Long id,Customer customer) {
         Customer customerDB = CustomerRepository.findById(id).get();
         customerDB.setName(customer.getName());
         customerDB.setName(customer.getEmail());
         customerDB.setName(customer.getPhone());
         return CustomerRepository.save(customerDB);
    }

    @Override
    public void delete(Long id) {
         Customer customerDB = CustomerRepository.findById(id).get();
         CustomerRepository.delete(customerDB);
    }
}
