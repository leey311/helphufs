package com.ll.helphofs.domain.ingredient.service;

import com.ll.helphofs.domain.ingredient.dto.IngredientDto;
import com.ll.helphofs.domain.ingredient.dto.IngredientRequire;
import com.ll.helphofs.domain.ingredient.entity.Ingredient;

import java.util.List;

public interface IngredientService {
	void updateIngredient(Long id, IngredientRequire ingredientRequire);
	void deleteIngredient(Long id);
	void addIngredient(IngredientRequire ingredient);
	List<Ingredient> getIngredientList();
	IngredientDto getIngredient(Long id);
}
