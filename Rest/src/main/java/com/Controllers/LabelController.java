package com.Controllers;

import mongo.models.Label;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping ("/label")
public class LabelController {

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Label getLabel(@RequestParam("id") String id) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, params = {"name","limit"})
    public Collection<Label> getLabelsByName(@RequestParam("name") String name, @RequestParam("limit") int limit) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Label> getLabelsByLocation(@RequestParam("location") String location, @RequestParam("limit") int limit) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Label> add(@RequestBody Label label) {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Label> update(@RequestParam("id") String id) {
        return null;
    }
}
