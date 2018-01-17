package com.Controllers;

import mongo.models.Relationship;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelationshipController {

    @RequestMapping( method = RequestMethod.GET)
    public Relationship getArtist() {
        return null;
    }
}
