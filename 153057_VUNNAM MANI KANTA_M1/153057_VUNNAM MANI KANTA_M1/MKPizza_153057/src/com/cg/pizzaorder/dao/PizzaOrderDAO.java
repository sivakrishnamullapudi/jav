package com.cg.pizzaorder.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exc.CustomExc;

public class PizzaOrderDAO implements IPizzaOrderDAO {

	Map<Integer, PizzaOrder> pizzaentry = new HashMap<Integer, PizzaOrder>();
	Map<Integer, Customer> customerEntry = new HashMap<Integer, Customer>();
	static int orderId;
	static int customerId;
	Random rand = new Random();

	@Override
	public int placeorder(Customer customer, PizzaOrder pizza) throws CustomExc {
		try {
			orderId = rand.nextInt(10000);
			customerId = rand.nextInt(10000);
			pizza.setOrderId(orderId);
			customer.setCustomerId(customerId);
			pizzaentry.put(orderId, pizza);
			pizzaentry.put(customerId, pizza);
			customerEntry.put(customerId, customer);
			return orderId;
		} catch (Exception e) {
			throw new CustomExc("Some error in printing id", e);
		}
	}

	@Override
	public PizzaOrder displayorder(int orderid) throws CustomExc {
		try {
			PizzaOrder p = pizzaentry.get(orderid);
			return p;
		} catch (Exception e) {
			throw new CustomExc("Some error while displaying", e);
		}
	}

}
