package pe.cibertec.ecommerce.ApiCustomer.service;
import java.util.List;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;
public interface CustomerService {
    public List<Customer> findAll();
    public Customer findById(Long id);
    public Customer findByEmail(String email);
    public Customer findByPhone (String phone);
    public Customer add(Customer customer);  
    public Customer update(Long id, Customer customer);
    public void delete(Long id);
    
    
}
