package comm.example.bean;



import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Component
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private CustomerDaoImpl cust;
	private Customer ct;

	
	public CustomerDaoImpl() {
		super();
	}


	public CustomerDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public List<Customer> getCustomers() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

	
	public void saveCustomer(Customer theCustomer) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save the customer ... finally LOL
		currentSession.save(theCustomer);
		
		

	}


	public void deleteCustomer(int id) {
		Session session=sessionFactory.getCurrentSession();
		Customer theCustomer=session.get(Customer.class, id);
		session.remove(theCustomer);
		
	}


	public Customer getCustomerById(int id) {
		Session session= sessionFactory.getCurrentSession();
		Customer theCustomer=session.get(Customer.class, id);
		return theCustomer;
	}


	public void editCustomer(int id,Customer theCustomer) {
		Session session=sessionFactory.getCurrentSession();
		Customer customer=new Customer(id,theCustomer.getFirstName(),theCustomer.getLastName(),theCustomer.getEmail());
		session.merge(customer);
		
	}


	public List<Customer> searchCustomer(String type, String text) {
		Session session=sessionFactory.getCurrentSession();
		Query <Customer> theQuery=session.createQuery("from Customer where "+type+" like  '%"+text+"%'");
		List<Customer> customers=theQuery.getResultList();
		return customers;
	}


}

