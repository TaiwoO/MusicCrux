package com.Controllers;

import mongo.models.Album;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    @RequestMapping( method = RequestMethod.GET)
    public Album getArtist() {
        return null;
    }
}
