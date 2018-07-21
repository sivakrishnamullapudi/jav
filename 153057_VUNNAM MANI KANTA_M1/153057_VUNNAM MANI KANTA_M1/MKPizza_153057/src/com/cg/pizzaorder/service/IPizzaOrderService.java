package com.cg.pizzaorder.service;

import java.util.Map;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exc.CustomExc;

public interface IPizzaOrderService {

	int placeorder(Customer customer, PizzaOrder pizza) throws CustomExc;

	PizzaOrder displayorder(int orderid) throws CustomExc;

}
