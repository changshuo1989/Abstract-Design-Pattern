package com.test;

import com.components.Cheese;
import com.components.Clam;
import com.components.Dough;
import com.components.Sauce;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSource();
	public Cheese createCheese();
	public Clam createClam();
}
