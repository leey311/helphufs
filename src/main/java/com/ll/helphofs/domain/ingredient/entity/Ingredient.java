package com.ll.helphofs.domain.ingredient.entity;

import com.ll.helphofs.domain.ingredient.dto.IngredientRequire;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String description;
	
	public void updateIngredient(IngredientRequire ingredientRequire) {
		this.name = ingredientRequire.getName();
		this.description = ingredientRequire.getDescription();
	}
}
