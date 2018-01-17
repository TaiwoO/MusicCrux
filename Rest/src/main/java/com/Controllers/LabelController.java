package com.Controllers;

import mongo.models.Label;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabelController {

    @RequestMapping( method = RequestMethod.GET)
    public Label getArtist() {
        return null;
    }
}
