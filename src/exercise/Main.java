package exercise;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exercise.order.domain.Customer;
import exercise.order.service.CustomerService;

public class Main {

	public static void main(String[] args) {

		System.out.println("hello");
	// ##### 2. ������ ���� ������ ���� �ڵ带 �ۼ��ϰ� �Ʒ� �ڵ��� �ּ��� ����
	ApplicationContext ctx = new 
			ClassPathXmlApplicationContext("exercise/bean.xml");

		
		// --------------------------------------
		// �Ʒ� �ڵ��� �ּ��� �����Ͽ��� �� �����Ǿ�� �Ѵ�.
		Customer customer = (Customer)ctx.getBean("customer");
			
		CustomerService customerService = (CustomerService)ctx.getBean("customerServiceImpl");
		customerService.saveCustomer(customer);
		customerService.deleteCustomer(1);		
	}

}
