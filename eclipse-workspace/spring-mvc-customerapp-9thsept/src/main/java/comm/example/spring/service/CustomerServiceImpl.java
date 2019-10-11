package comm.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.spring.dao.CustomerDao;
import comm.example.spring.entity.Customer;
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

}
