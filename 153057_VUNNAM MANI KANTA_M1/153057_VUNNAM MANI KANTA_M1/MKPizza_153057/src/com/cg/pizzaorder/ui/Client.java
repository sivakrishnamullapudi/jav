package com.cg.pizzaorder.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.pizzaorder.bean.Customer;
import com.cg.pizzaorder.bean.PizzaOrder;
import com.cg.pizzaorder.exc.CustomExc;
import com.cg.pizzaorder.service.IPizzaOrderService;
import com.cg.pizzaorder.service.PizzaOrderService;

public class Client {
	public static void main(String[] args) throws CustomExc {
		IPizzaOrderService service;
		{
			service = new PizzaOrderService();
		}
		Scanner sc = new Scanner(System.in);
		
		String ans;
		
		do {
			System.out.println("ENTER ");
			System.out.println("1.Place Order");
			System.out.println("2.Display Order");
			System.out.println("3.Exit");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Enter your Name");
				String custName = sc.next();
				System.out.println("Enter your Address");
				String address = sc.next();
				System.out.println("Enter your valid phone number of length 10");
				String phone = sc.next();
				if(phone.length()==10)
					{
				Customer customer = new Customer(custName, address, phone);
				System.out.println("Type of Pizza Topping preferred");
				String pizzatopping = sc.next();
				int price=0;
				if(pizzatopping.equals("Capsicum"))
				{ 
					price=30+350;
				System.out.println("Price:To be calculated:Rs:350+30(Capsicum)="+price);
				}
				else if(pizzatopping.equals("Mushroom"))
					{
					price=50+350;
					System.out.println("Price:To be calculated:Rs:350+50(Mushroom)="+price);
					}
				
				else if(pizzatopping.equals("Jalapeno"))
				{
					price=70+350;
					System.out.println("Price:To be calculated:Rs:350+70(Jalapeno)="+price);
					}
				else if(pizzatopping.equals("Paneer"))
					{price=85+350;
					System.out.println("Price:To be calculated:Rs:350+85(Paneer)="+price);
					}
				else System.out.println("Enter only Capsicum,paneer,mushroom,jalapeno");
				
				PizzaOrder pizza = new PizzaOrder(pizzatopping,price);
				int id = service.placeorder(customer, pizza);
				System.out.println("Pizza Order successfully placed with Order Id:" + id);
					}
				else System.out.println("Enter vaid 10 digit number");
				break;
			case 2:
				System.out.println("enter orderid");
				int orderid = sc.nextInt();
				PizzaOrder m2= service.displayorder(orderid);
				System.out.println("Order Id:"+m2);
				break;
			case 3:
				return;
			}
			System.out.println("do u want to continue");
			ans = sc.next();
		} while (ans.equals("Yes") | ans.equals("yes") | ans.equals("y"));

	}

}
