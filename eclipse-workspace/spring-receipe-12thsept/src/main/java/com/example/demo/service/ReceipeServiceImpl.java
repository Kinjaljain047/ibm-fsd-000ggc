package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Note;
import com.example.demo.model.Receipe;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.repository.NoteRepository;
import com.example.demo.repository.ReceipeRepository;


@Service
public class ReceipeServiceImpl implements ReceipeService {
private ReceipeRepository receipeRepository;
private IngredientRepository ingredientRepository;
private NoteRepository noteRepository;



@Autowired
	public ReceipeServiceImpl(ReceipeRepository receipeRepository, IngredientRepository ingredientRepository,
		NoteRepository noteRepository) {
	super();
	this.receipeRepository = receipeRepository;
	this.ingredientRepository = ingredientRepository;
	this.noteRepository = noteRepository;
}



	public ReceipeServiceImpl() {
	super();
}



	@Override
	public List<Receipe> findAllReceipe() {
		// TODO Auto-generated method stub
		return receipeRepository.findAll() ;
	}

	@Override
	public List<Ingredient> findAllIngredient() {
		// TODO Auto-generated method stub
		return ingredientRepository.findAll();
	}

	@Override
	public List<Note> findAllNote() {
		// TODO Auto-generated method stub
		return noteRepository.findAll();
	}



	@Override
	public Receipe getRecipeById(long id) {
	Receipe r= new Receipe();
	Optional<Receipe> result= receipeRepository.findById(id);
	if(result.isPresent()) {
		r=result.get();
		
	}else {
		throw new RuntimeException("result is not present");
	}
	return r;
	}



	@Override
	public Note getNoteById(long id) {
		Note n= new Note();
		Optional<Note> result= noteRepository.findById(id);
		if(result.isPresent()) {
			n=result.get();
			
		}else {
			throw new RuntimeException("result is not present");
		}
		return n;
	}



	@Override
	public Ingredient getIngredientById(long id) {
		Ingredient i= new Ingredient();
		Optional<Ingredient> result= ingredientRepository.findById(id);
		if(result.isPresent()) {
			i=result.get();
			
		}else {
			throw new RuntimeException("result is not present");
		}
		return i;
	}

}
