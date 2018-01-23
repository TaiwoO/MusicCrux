package com.Services;

import mongo.models.Band;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandService {


    /**
     *
     * @param id id of the Band
     * @return The Band matching the id
     */
    public Band getBand( String id) {
        return null;
    }

    /**
     *
     * @param name Search string
     * @param limit max number of bands to return
     * @return bands matching the @name
     */
    public List<Band> getBandByName(String name, int limit) {
        return null;
    }

    /**
     *
     * @param band Band to add in the database
     * @return The Band that was added
     */
    public Band add(Band band) {
        return null;
    }

    /**
     *
     * @param id id of the Band
     * @return The Band that was updated
     */
    public Band update( String id) {
        return null;
    }
}
