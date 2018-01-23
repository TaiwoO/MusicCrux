package com.Services;

import mongo.models.Artist;
import mongo.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    /**
     * Returns an artist with the specified id.
     *
     * @param id  id of the Artist
     * @return The Artist matching the id
     */
    public Artist getArtist(String id) {
        return artistRepository.findOne(id);
    }

    /**
     * @param name   Search string
     * @param limit  max number of artists to return
     * @return artists matching the @name
     */
    public List<Artist> getArtistsByName(String name, int limit) {
        return null;
    }

    /**
     *
     * @param artist Artist to add in the database
     * @return The Artist that was added
     */
    public List<Artist> add(Artist artist) {
        return null;
    }

    /**
     *
     * @param id id of the Artist
     * @return The Artist that was updated
     */
    public Artist update(String id) {
        return null;
    }
}
