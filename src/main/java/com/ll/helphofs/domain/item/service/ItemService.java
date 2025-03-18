package com.ll.helphofs.domain.item.service;

import com.ll.helphofs.domain.item.dto.ItemRequire;
import com.ll.helphofs.domain.item.entity.Item;

import java.util.List;

interface ItemService {
	List<Item> findAll();
	Item findById(Long id);
	void save(ItemRequire itemRequire);
	void delete(Long id);
	void update(Long id, ItemRequire itemRequire);
}
