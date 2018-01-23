package com.Controllers;

import mongo.models.Album;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Album getAlbum(@PathVariable("id") String id) {

        List<String> genres = new ArrayList<String>();
        genres.add("Rock");
        genres.add("Hip-Hop");

        Album tempAlbum = new Album();
            tempAlbum.setCountry("Swedin");
            tempAlbum.setTitle("Nice");
            tempAlbum.setGenres(genres);

        return tempAlbum;
    }

    @RequestMapping(method = RequestMethod.GET, params = {"name","limit"})
    public List<Album> getAlbumsByName(@RequestParam("name") String name, @RequestParam("limit") int limit) {

        List<String> genres = new ArrayList<>();
        genres.add("Rock");
        genres.add("Hip-Hop");

        Album tempAlbum = new Album();
        tempAlbum.setCountry("Swedin");
        tempAlbum.setTitle("Nice");
        tempAlbum.setGenres(genres);

        Album tempAlbum2 = new Album();
        tempAlbum2.setCountry("Swedin2");
        tempAlbum2.setTitle("Nice2");
        tempAlbum2.setGenres(genres);

        ArrayList<Album> tempList = new ArrayList<>();
        tempList.add(tempAlbum);
        tempList.add(tempAlbum2);
        return tempList;
    }

    @RequestMapping(method = RequestMethod.GET, params = {"genres","limit"})
    public List<Album> getAlbumsByGenres(@RequestParam("genres") List<String> genres, @RequestParam("limit") int limit) {

        System.out.println(genres);
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Album> add(@RequestBody Album album) {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Album> update(@RequestParam("id") String id) {
        return null;
    }


}
