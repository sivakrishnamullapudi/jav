package com.cg.pizzaorder.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.pizzaorder.bean.PizzaOrder;

class junittest1 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("SET BEFORE CLASS");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("TEARDOWN AFTER CLASS");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("SETUP");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("TEAR DOWN");
	}

	@Test
	void test1() {

PizzaOrder p=new PizzaOrder("Capsicum");
p.setCustomerId(100);
String s=""+p.getCustomerId();
assertEquals("100",s );

	}
	@Test
	void test2() {
PizzaOrder p=new PizzaOrder("Capsicum");
p.setOrderId(1001);
String s=""+p.getOrderId();
assertEquals("1001", s);

	}

}
