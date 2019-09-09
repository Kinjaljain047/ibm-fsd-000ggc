package comm.example.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
private CustomerDao customerDao;

	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}


@Transactional
	public void saveCustomer(Customer theCustomer) {
				customerDao.saveCustomer(theCustomer);
	}


public CustomerServiceImpl() {
	super();
}


public CustomerServiceImpl(CustomerDao customerDao) {
	super();
	this.customerDao = customerDao;
}


public CustomerDao getCustomerDao() {
	return customerDao;
}


public void setCustomerDao(CustomerDao customerDao) {
	this.customerDao = customerDao;
}

@Transactional
public void deleteCustomer(int id) {
	customerDao.deleteCustomer(id);
	
}

@Transactional
public Customer getCustomerById(int id) {
	return customerDao.getCustomerById(id);
	
}

@Transactional
public void editCustomer(int id,Customer theCustomer) {
	customerDao.editCustomer(id,theCustomer);
	
}

@Transactional
public List<Customer> searchCustomer(String type, String text) {
	return customerDao.searchCustomer(type, text);
}

}
