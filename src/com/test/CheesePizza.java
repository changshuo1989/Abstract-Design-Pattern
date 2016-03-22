package com.test;

public class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory=ingredientFactory;
	}
	
	
	@Override
	void prepare() {
		System.out.println("Preparing "+name);
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSource();
		cheese=ingredientFactory.createCheese();
		
		
		
	}

}
