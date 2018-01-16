package mongo.repositories;

import mongo.models.Band;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BandRepository extends MongoRepository<Band, String> {
	
	public Band findByLabel(String label);
}