package mongo.repositories;

import mongo.models.Track;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TrackRepository extends MongoRepository<Track, String> {

    public List<Track> findByNameContaining(String name, Pageable pageable);
}
