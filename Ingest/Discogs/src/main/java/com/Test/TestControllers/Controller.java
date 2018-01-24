package com.Test.TestControllers;
import com.Models.Artist;
import com.Models.Band;
import com.Test.TestServices.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    EntityService service = new EntityService();

    @RequestMapping(value = "/Artist", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<Artist> addArtist(@RequestBody Artist artist){
        HttpStatus status = artist == null ? HttpStatus.BAD_REQUEST : HttpStatus.ACCEPTED;
        service.entity(artist);
        return new ResponseEntity<Artist>(artist, status);
    }

    @RequestMapping(value = "/Band", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<Band> addArtist(@RequestBody Band band){
        HttpStatus status = band == null ? HttpStatus.BAD_REQUEST : HttpStatus.ACCEPTED;
        service.entity(band);
        return new ResponseEntity<Band>(band, status);
    }

}
