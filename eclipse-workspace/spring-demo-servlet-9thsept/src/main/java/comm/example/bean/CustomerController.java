package comm.example.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/list")
	public String getList(Model theModel) {
		List<Customer> theCustomer=customerService.getCustomers();
		theModel.addAttribute("customers",theCustomer);
		return "list-customers";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		
		// save the customer using our service
		customerService.saveCustomer(theCustomer);
		
		
		return "redirect:/customer/list";
	}
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("id") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	}
	@GetMapping("/getCustomer")
	public String getCustomerById(@RequestParam("id") int id,Model theModel) {
		Customer cust=customerService.getCustomerById(id);
		theModel.addAttribute("customer", cust);
		return "edit-form";
	}
	
	@PostMapping("/editCustomer")
	public String editCustomer(@RequestParam("id") int id,@ModelAttribute("customer") Customer theCustomer) {
		customerService.editCustomer(id,theCustomer);
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/search")
	public String search() {
		return "search-form";
	}
	
	@GetMapping("/searchCustomer")
	public String searchCustomer(@RequestParam("data") String text,@RequestParam("search") String type,Model theModel) {
		List<Customer> custlist=customerService.searchCustomer(type, text);
		System.out.println(custlist.toString());
		theModel.addAttribute("customers", custlist);
		return "search-list";
	}
}
