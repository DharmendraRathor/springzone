package com.example.customer.manager;

import java.util.Optional;

import org.springframework.stereotype.Controller;

import com.example.customer.model.Customer;

@Controller
public class CustomerManager {

	public Optional<Customer> getCustomer(String id) {

		if (id.equals("1")) {
			return Optional.empty();
		} else {
			Customer cust = new Customer("1", "cust-name1");
			cust.setAddress(id);
			return Optional.of(cust);
		}

	}
}
