package comm.spring;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	
		@Autowired
		private SessionFactory sessionFactory;
		private Session session;
		private List<Customer> list =new ArrayList<Customer>();
		
		@PostConstruct
		public void init() {
			session=sessionFactory.openSession();
		}
		
		
		@SuppressWarnings("unchecked")
		
		@Transactional
		public List<Customer> getAllCustomers() {
			// TODO Auto-generated method stub
			list= session.createQuery("from Customer",Customer.class).getResultList();
			return list;
		}


		@Override
		public void saveCustomer(Customer theCustomer) {
			Session session=sessionFactory.getCurrentSession();
			session.saveOrUpdate(theCustomer);
			
		}


}
