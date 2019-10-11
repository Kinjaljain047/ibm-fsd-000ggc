package comm.spring;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
private CustomerDao dao; 


	@Transactional
	public List<Customer> getAllCustomers() {
		return dao.getAllCustomers();
	}


@Transactional
	@Override
	public void saveCustomer(Customer theCustomer) {
		dao.saveCustomer(theCustomer);
		
	}

}
