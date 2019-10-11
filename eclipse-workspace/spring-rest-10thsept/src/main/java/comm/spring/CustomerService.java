package comm.spring;

import java.util.List;

public interface CustomerService {
public List<Customer> getAllCustomers();
public void saveCustomer(Customer theCustomer);
}
