package com.Controllers;

import mongo.models.Artist;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping ("/artist")
public class ArtistController {

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Artist getArtist(@RequestParam("id") String id) {
        Artist tempArtist = new Artist();
            tempArtist.setId("kdnkfsndkfndsfnsdfnsd0");
            tempArtist.setLabel("Jeo");

        return tempArtist;
    }

    @RequestMapping(method = RequestMethod.GET, params = {"name","limit"})
    public Collection<Artist> getArtistsByName(@RequestParam("name") String name, @RequestParam("limit") int limit) {
        return null;
    }

    @RequestMapping( method = RequestMethod.POST)
    public ResponseEntity<Artist> add(@RequestBody Artist artist) {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Artist> update(@RequestParam("id") String id) {
        return null;
    }

}
