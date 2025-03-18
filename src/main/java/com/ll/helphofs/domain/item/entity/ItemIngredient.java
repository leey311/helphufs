package com.ll.helphofs.domain.item.entity;

import com.ll.helphofs.domain.ingredient.entity.Ingredient;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.domain.Persistable;

import java.time.LocalDate;

@Entity
public class ItemIngredient implements Persistable<ItemIngredientId> {
	@EmbeddedId
	private ItemIngredientId id;
	
	@MapsId("itemId")
	@ManyToOne(fetch = FetchType.LAZY)
	private Item item;
	
	@MapsId("ingredientId")
	@ManyToOne(fetch = FetchType.LAZY)
	private Ingredient ingredient;
	
	@CreatedDate
	private LocalDate createdAt;
	
	@Override
	public ItemIngredientId getId() {
		return id;
	}
	
	@Override
	public boolean isNew() {
		return false;
	}
}
