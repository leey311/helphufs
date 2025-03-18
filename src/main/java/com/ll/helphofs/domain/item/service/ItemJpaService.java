package com.ll.helphofs.domain.item.service;

import com.ll.helphofs.domain.item.dto.ItemRequire;
import com.ll.helphofs.domain.item.entity.Item;
import com.ll.helphofs.domain.item.repository.ItemRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ItemJpaService implements ItemService{
	private final ItemRepository itemRepository;
	
	@Override
	public void save(ItemRequire itemRequire) {
		Item item = Item.builder()
				.name(itemRequire.getName())
				.price(itemRequire.getPrice())
				.producer(itemRequire.getProducer())
				.targetSkinType(itemRequire.getTargetSkinType())
				.itemCategory(itemRequire.getItemCategory())
				.build();
		itemRepository.save(item);
	}
	
	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}
	
	@Override
	public Item findById(Long id) {
		return itemRepository.findById(id).orElseThrow();
	}
	
	@Override
	public void delete(Long id) {
		itemRepository.deleteById(id);
	}
	
	@Override
	public void update(Long id, ItemRequire itemRequire) {
		Item item = itemRepository.findById(id).orElseThrow();
		item.updateItem(itemRequire);
	}
}
