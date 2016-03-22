package com.test;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nystore=new NYPizzaStore();
		Pizza pizza=nystore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName()+ "\n");

	}

}
