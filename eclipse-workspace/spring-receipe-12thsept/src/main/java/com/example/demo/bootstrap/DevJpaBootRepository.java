package com.example.demo.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Note;
import com.example.demo.model.Receipe;
import com.example.demo.repository.IngredientRepository;
import com.example.demo.repository.NoteRepository;
import com.example.demo.repository.ReceipeRepository;
import com.example.demo.service.ReceipeService;

@Component
public class DevJpaBootRepository implements ApplicationListener<ContextRefreshedEvent> {
  private ReceipeRepository receipeRepository;
  private IngredientRepository ingredientRepository;
  private NoteRepository noteRepository;
  private ReceipeService rs;
  
  
public DevJpaBootRepository(ReceipeRepository receipeRepository, IngredientRepository ingredientRepository,
		NoteRepository noteRepository) {
	super();
	this.receipeRepository = receipeRepository;
	this.ingredientRepository = ingredientRepository;
	this.noteRepository = noteRepository;
}



@Override
public void onApplicationEvent(ContextRefreshedEvent event) {
	// TODO Auto-generated method stub
	init();
}
  
  public void init() {
	  Receipe rec= new Receipe();
	  rec.setCooktime("20 min");
	  rec.setDescription("Fried Rice");
	  rec.setDifficulty("moderate");
	  rec.setDirection("cook for rice for 10 min");
	  rec.setPreptime("10 min");
	  rec.setServings("4");
	  
	  
	  Ingredient in=new Ingredient();
	  in.setAmount("4 cups of rice and other ingredients");
	  in.setDescription("take white rice,boil it for 10 min and add all other ingredients and fry it");
	  in.getReceipe().add(rec);
	  rec.getIngredient().add(in);
	  
	Ingredient ig= new Ingredient();
	ig.setAmount("2 cups of oil");
	ig.setDescription("add oil anf leave it for 10 min for cook");
	ig.getReceipe().add(rec);
	rec.getIngredient().add(ig);
	
	  Note no= new Note();
	  no.setReceipenotes("its quite simple to cook");
	  no.setreceipe(rec);
	  receipeRepository.save(rec);
	  noteRepository.save(no);
	  ingredientRepository.save(in);
	  ingredientRepository.save(ig);
  }
}
