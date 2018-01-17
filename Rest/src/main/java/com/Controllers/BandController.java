package com.Controllers;

import mongo.models.Band;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BandController {

    @RequestMapping( method = RequestMethod.GET)
    public Band getArtist() {
        return null;
    }
}
