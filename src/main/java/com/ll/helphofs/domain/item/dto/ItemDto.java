package com.ll.helphofs.domain.item.dto;

import com.ll.helphofs.domain.ingredient.entity.Ingredient;
import com.ll.helphofs.global.category.ItemCategory;
import com.ll.helphofs.global.category.SkinType;

import java.time.LocalDateTime;
import java.util.List;

public class ItemDto {
	private String name;
	private Double price;
	private String producer;
	private SkinType targetSkinType;
	private ItemCategory itemCategory;
	private LocalDateTime createTime;
	private List<Ingredient> ingredientList;
}
