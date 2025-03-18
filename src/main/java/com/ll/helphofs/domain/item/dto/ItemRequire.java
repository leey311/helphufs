package com.ll.helphofs.domain.item.dto;

import com.ll.helphofs.global.category.ItemCategory;
import com.ll.helphofs.global.category.SkinType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemRequire {
	private String name;
	private Double price;
	private String producer;
	private SkinType targetSkinType;
	private ItemCategory itemCategory;
}
