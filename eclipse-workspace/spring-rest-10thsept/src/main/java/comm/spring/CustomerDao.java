package comm.spring;

import java.util.List;

public interface CustomerDao {
public List<Customer> getAllCustomers();
public void saveCustomer(Customer theCustomer);
}
