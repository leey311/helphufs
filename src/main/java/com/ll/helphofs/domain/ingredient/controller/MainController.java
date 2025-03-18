package com.ll.helphofs.domain.ingredient.controller;

import com.ll.helphofs.domain.ingredient.dto.IngredientDto;
import com.ll.helphofs.domain.ingredient.dto.IngredientRequire;
import com.ll.helphofs.domain.ingredient.entity.Ingredient;
import com.ll.helphofs.domain.ingredient.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/ingredient")
public class MainController {
	private final IngredientService ingredientService;
	
	@PostMapping
	public ResponseEntity<String> addIngredient(
			@RequestBody IngredientRequire ingredientRequire
	){
		ingredientService.addIngredient(ingredientRequire);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body("성공적으로 등록되었습니다.");
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Ingredient>> getIngredientList(
	){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(ingredientService.getIngredientList());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<IngredientDto> getIngredientOne(
			@PathVariable Long id
	){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(ingredientService.getIngredient(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateIngredient(
			@PathVariable Long id,
			@RequestBody IngredientRequire ingredientRequire
	){
		ingredientService.updateIngredient(id, ingredientRequire);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("성공적으로 수정되었습니다.");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteIngredient(
			@PathVariable Long id
	){
		ingredientService.deleteIngredient(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("성공적으로 삭제되었습니다.");
	}
}
