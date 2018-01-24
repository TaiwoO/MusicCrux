package com.Test.TestServices;

import com.Models.Artist;
import com.Models.Band;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class EntityService {

    public ResponseEntity<Artist> entity(Artist artist){
        System.out.println("Artist:");
        System.out.println(artist.toString());
        return null;
    }

    public ResponseEntity<Band> entity(Band band){
        System.out.println("Band:");
        System.out.println(band.toString());
        return null;
    }

}
