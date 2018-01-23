package com.Controllers;

import mongo.models.Relationship;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping ("/relationship")
public class RelationshipController {

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Relationship getRelationship(@RequestParam("id") String id) {

        return null;
    }

    @RequestMapping(method = RequestMethod.GET, params = {"types","limit"})
    public Collection<Relationship> getRelationshipsByTypes(@RequestParam("types") List<String> type, @RequestParam("limit") int limit) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Relationship> add(@RequestBody Relationship relationship) {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Relationship> update(@RequestParam("id") String id) {
        return null;
    }

}
