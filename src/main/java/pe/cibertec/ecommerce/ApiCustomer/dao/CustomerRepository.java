package pe.cibertec.ecommerce.ApiCustomer.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

    Customer findByEmail(String email);
    //@Query ("select c from customer where c.phone=?1 and c.email=?2")
    //00Customer findByPhone (String phone,string email);
    @Query ("select c from Customer c where c.phone=?1")
    Customer findByPhone (String phone);

    
}
