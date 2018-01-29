package mongo.repositories;

import java.util.List;

import mongo.models.Relationship;
import mongo.models.RelationshipType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.domain.Pageable;




public interface RelationshipRepository extends MongoRepository<Relationship, String>{
	
	public Relationship findByType(RelationshipType relationshipType);
	
	@Query("{$or: [{'entityA' :{'$ref' : 'entity' , '$id' : ?0}}, {'entityB' :{'$ref' : 'entity' , '$id' : ?0}}] }")
	public List<Relationship> findByEntity(String entityId);

}