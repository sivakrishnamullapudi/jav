package com.cg.pizzaorder.service;

import java.util.Map;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.dao.IPizzaOrderDAO;
import com.cg.pizzaorder.dao.PizzaOrderDAO;
import com.cg.pizzaorder.exc.CustomExc;

public class PizzaOrderService implements IPizzaOrderService {
	IPizzaOrderDAO serviceDao;
	{
		serviceDao = new PizzaOrderDAO();
	}

	@Override
	public int placeorder(Customer customer, PizzaOrder pizza) throws CustomExc {
		int id = serviceDao.placeorder(customer, pizza);
		return id;
	}

	@Override
	public PizzaOrder displayorder(int orderid) throws CustomExc {
		PizzaOrder p = serviceDao.displayorder(orderid);
		return p;
	}

}
