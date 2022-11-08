package exercise.order.repository;

import org.springframework.stereotype.Component;

import exercise.order.domain.Customer;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {

	private Customer out;
	@Override
	public void save(Customer customer) {
		System.out.println(customer + "�� ����Ǿ����ϴ�.");
	}
	@Override
	public void delete(long id) {
		System.out.println(id + "�� ���� �����Ǿ����ϴ�.");
	}

}