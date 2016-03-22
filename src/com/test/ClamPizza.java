package com.test;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory=ingredientFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing "+name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSource();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
