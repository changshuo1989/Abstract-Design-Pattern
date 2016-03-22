package com.test;

import com.components.Cheese;
import com.components.Clam;
import com.components.Dough;
import com.components.FrozenClam;
import com.components.Mozzarella;
import com.components.PlumTomatoSauce;
import com.components.ThickCrustDough;
import com.components.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSource() {
		return new PlumTomatoSauce();

	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();

	}

	@Override
	public Clam createClam() {
		return new FrozenClam();

	}

}
