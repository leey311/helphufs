package com.ll.helphofs.domain.item.entity;

import com.ll.helphofs.domain.item.dto.ItemRequire;
import com.ll.helphofs.global.category.ItemCategory;
import com.ll.helphofs.global.category.SkinType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	private String name;
	
	private Double price;
	
	private String producer;
	
	private SkinType targetSkinType;
	
	private ItemCategory itemCategory;
	
	@CreatedDate
	private LocalDateTime createTime;
	
	@OneToMany
	private List<ItemIngredient> itemIngredients;
	
	public void updateItem(ItemRequire itemRequire) {
		this.name = itemRequire.getName();
		this.price = itemRequire.getPrice();
		this.producer = itemRequire.getProducer();
		this.targetSkinType = itemRequire.getTargetSkinType();
		this.itemCategory = itemRequire.getItemCategory();
	}
}
