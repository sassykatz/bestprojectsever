package com.churchmutual.recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a meal item made up of ingredients
 * @author Sassykatz13
 *
 */
public class Recipe {
	
	private String name;
	private List<Ingredient> ingredients = new ArrayList<>();
	
	public Recipe(String name, List<Ingredient> ingredients) {
		super();
		this.name = name;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
