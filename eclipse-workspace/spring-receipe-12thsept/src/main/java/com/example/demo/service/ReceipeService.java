package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Note;
import com.example.demo.model.Receipe;

public interface ReceipeService {
	public List<Receipe> findAllReceipe();
	public List<Ingredient> findAllIngredient();
	public List<Note> findAllNote();
	
	public Receipe getRecipeById(long id);
	public Note getNoteById(long id);
	public Ingredient getIngredientById(long id);
}
