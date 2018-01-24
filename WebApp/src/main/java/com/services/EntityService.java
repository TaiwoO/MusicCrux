package com.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import com.models.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EntityService {

	private RestTemplate restTemplate = new RestTemplate();
	// TODO: Update this function to reflect the changes to the Relationship models
	/**
	 * Creates a molecule from the provided labels.
	 * The Molecule consists of the entities and relationships corresponding to the labels
	 * //@param entities
	 * @return Molecule
	 */

	//Service makes the GET requests to Music-Crux RESTful API
	public List<Entity> getEntitySearchResults(String name, String type, int limit){
		//Type parameter will be of enum EntityType -> {'ARTIST', 'BAND', 'LABEL', 'ALBUM', 'TRACK'}
		//List<Entity> entities = restTemplate.getForObject("http://localhost:8080/MusicCrux/api/{type.toLowerCase()}/{label}/{limit}", List.class);

		List<Entity> entities = new ArrayList<>();
		System.out.println("Request made.");
		Artist myArtist = restTemplate.getForObject("https://api.myjson.com/bins/1f1fld", Artist.class);
		System.out.println(myArtist.toString());
		entities.add(myArtist);
		return entities;
}

// This is the old method for retrieving entity search results with EntityRepository.
// Now, we are using REST calls to retrieve those entity search results versus directly touching EntityRepository.

//	public List<EntityUI> getEntitySearchResults(String name, int limit){
//		List<Entity> searchResults = new ArrayList<>();
//		searchResults = entityRepository.findByLabelContainingIgnoreCase(name, new PageRequest(0,limit));
//		return EntityUI.dbModelToUiModel(searchResults);
//	}
}