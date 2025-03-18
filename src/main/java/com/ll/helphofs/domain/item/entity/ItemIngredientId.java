package com.ll.helphofs.domain.item.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@EqualsAndHashCode
public class ItemIngredientId implements Serializable {
	private Long itemId;
	private Long ingredientId;
	
	public ItemIngredientId(Long itemId, Long ingredientId) {
		this.itemId = itemId;
		this.ingredientId = ingredientId;
	}
}
