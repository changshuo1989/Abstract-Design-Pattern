package com.test;

import com.components.Cheese;
import com.components.Clam;
import com.components.Dough;
import com.components.Sauce;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Clam clam;
	Cheese cheese;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	void box(){
		System.out.println("Place pizza in official pizzaStore box");
	}
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
