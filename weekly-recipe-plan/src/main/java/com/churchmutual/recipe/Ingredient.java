package com.churchmutual.recipe;

/**
 * Represents a food item
 * @author Sassykatz13
 *
 */
public class Ingredient {
	
	private String name;

	public Ingredient(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
