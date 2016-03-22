package com.test;

import com.components.Cheese;
import com.components.Clam;
import com.components.Dough;
import com.components.FreshClam;
import com.components.MarinaraSauce;
import com.components.ReggianoCheese;
import com.components.ThinCrustDough;
import com.components.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();

	}

	@Override
	public Sauce createSource() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Clam createClam() {
		// TODO Auto-generated method stub
		return new FreshClam();
	}

}
