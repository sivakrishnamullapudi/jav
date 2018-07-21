package com.cg.pizzaorder.dao;

import java.util.Map;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exc.CustomExc;

public interface IPizzaOrderDAO {

	int placeorder(Customer customer, PizzaOrder pizza) throws CustomExc;

	PizzaOrder displayorder(int orderid) throws CustomExc;

}
