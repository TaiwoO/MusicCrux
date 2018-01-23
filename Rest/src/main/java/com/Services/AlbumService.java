package com.Services;

import mongo.models.Album;
import mongo.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    AlbumRepository albumRepository;

    /**
     * @param id id of the Album
     * @return The Album matching the id
     */
    public Album getAlbum(String id) {

        return albumRepository.findOne(id);
    }

    /**
     * @param name  Search string
     * @param limit max number of albums to return
     * @return Albums matching the @name
     */
    public List<Album> getAlbumsByName(String name, int limit) {

        return null;
    }

    /**
     * @param genres genres to search by
     * @param limit  max number of albums to return
     * @return albums matching the @genres
     */
    public List<Album> getAlbumsByGenres(List<String> genres, int limit) {
        return null;
    }

    /**
     * Adds a new album to the database
     *
     * @param album Album to add in the database
     * @return The Album that was added
     */
    public Album add(Album album) {
        return null;
    }

    /**
     * Updates an Album already in the database
     *
     * @param id id of the Album
     * @return The Album that was updated
     */
    public Album update(String id) {
        return null;
    }
}