package comm.example.bean;

import java.util.List;

public interface CustomerService {
	public List<Customer> getCustomers();
public void saveCustomer(Customer theCustomer);
public void deleteCustomer(int id);
public Customer getCustomerById(int id);
public void editCustomer(int id,Customer theCustomer);
public List<Customer> searchCustomer(String type,String text);
}