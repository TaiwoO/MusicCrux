package mongo.repositories;

import mongo.models.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ArtistRepository extends MongoRepository<Artist, String> {
	
	public Artist findByName(String name);
}
