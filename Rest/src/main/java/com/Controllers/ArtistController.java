package com.Controllers;

import mongo.models.Artist;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/artist")
public class ArtistController {

    @RequestMapping( method = RequestMethod.GET)
    public Artist getArtist() {
        return null;
    }

}
