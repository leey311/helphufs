package com.ll.helphofs.domain.ingredient.service;

import com.ll.helphofs.domain.ingredient.dto.IngredientDto;
import com.ll.helphofs.domain.ingredient.dto.IngredientRequire;
import com.ll.helphofs.domain.ingredient.entity.Ingredient;
import com.ll.helphofs.domain.ingredient.repository.IngredientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class IngredientJpaService implements IngredientService {
	private final IngredientRepository ingredientRepository;
	
	@Override
	public void updateIngredient(Long id, IngredientRequire ingredientRequire
	){
		Ingredient ingredient = findIngredientById(id);
		ingredient.updateIngredient(ingredientRequire);
	}
	
	@Override
	public void deleteIngredient(Long id
	){
		Ingredient ingredient = findIngredientById(id);
		ingredientRepository.delete(ingredient);
	}
	
	@Override
	public void addIngredient(IngredientRequire ingredientRequire
	){
		Ingredient ingredient = Ingredient.builder()
				.name(ingredientRequire.getName())
				.description(ingredientRequire.getDescription())
				.build();
		ingredientRepository.save(ingredient);
	}
	
	@Override
	public List<Ingredient> getIngredientList(
	){
		return ingredientRepository.findAll();
	}
	
	@Override
	public IngredientDto getIngredient(Long id
	){
		return ingredientRepository
				.findById(id)
				.stream()
				.map(IngredientDto::new)
				.findAny()
				.orElseThrow();
	}
	
	private Ingredient findIngredientById(Long id) {
		return ingredientRepository.findById(id).orElseThrow();
	}
}


