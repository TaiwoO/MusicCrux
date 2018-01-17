package com.services;

import java.util.ArrayList;
import java.util.List;

import com.models.*;
import org.springframework.stereotype.Service;


//import app.api.models.ui.EntityUI;
//import models.Entity;
//import repositories.EntityRepository;
//import repositories.RelationshipRepository;


@Service
public class EntityService {

	// TODO: Update this function to reflect the changes to the Relationship models


	/**
	 * Creates a molecule from the provided labels.
	 * The Molecule consists of the entities and relationships corresponding to the labels
	 * //@param entities
	 * @return Molecule
	 */
	//Service makes the GET requests to Music-Crux RESTful API
	public List<Entity> getEntitySearchResults(String name, String type, int limit){
		//Make HTTP Get-Request to "/MusicCrux/API/Artists"
		return null;
	}


//	public List<EntityUI> getEntitySearchResults(String name, int limit){
//		List<Entity> searchResults = new ArrayList<>();
//		searchResults = entityRepository.findByLabelContainingIgnoreCase(name, new PageRequest(0,limit));
//		return EntityUI.dbModelToUiModel(searchResults);
//	}
}
