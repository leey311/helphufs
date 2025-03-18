package com.ll.helphofs.domain.ingredient.dto;

import com.ll.helphofs.domain.ingredient.entity.Ingredient;

public class IngredientDto {
	public IngredientDto(Ingredient ingredient) {
		String name = ingredient.getName();
		String description = ingredient.getDescription();
	}
}
