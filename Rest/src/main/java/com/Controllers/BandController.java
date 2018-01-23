package com.Controllers;

import mongo.models.Band;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping ("/band")
public class BandController {

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Band getBand(@RequestParam("id") String id) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, params = {"name","limit"})
    public Collection<Band> getBandByName(@RequestParam("name") String name, @RequestParam("limit") int limit) {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Band> add(@RequestBody Band band) {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Band> update(@RequestParam("id") String id) {
        return null;
    }

}
