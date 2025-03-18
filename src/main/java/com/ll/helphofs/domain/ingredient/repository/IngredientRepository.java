package com.ll.helphofs.domain.ingredient.repository;

import com.ll.helphofs.domain.ingredient.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
