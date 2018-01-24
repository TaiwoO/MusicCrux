package mongo.repositories;

import mongo.models.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface AlbumRepository extends MongoRepository<Album, String>{

    public Album findByName(String name);
    public List<Album> findAlbumsByCountry(String countries);
}
