package mongo.repositories;

import mongo.models.Album;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface AlbumRepository extends MongoRepository<Album, String>{

}
