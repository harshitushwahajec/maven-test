import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harshit.service.CustomerService;
import com.harshit.service.CustomerServiceImpl;

public class Application {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		
		//CustomerService customerService = new CustomerServiceImpl();
		
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = applicationContext.getBean(CustomerServiceImpl.class);
		System.out.println(customerService.findAll().get(0).getFirstName());


	}

}
