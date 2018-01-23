package com.Services;

import mongo.models.Label;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {

    /**
     *
     * @param id id of the Label
     * @return The Label matching the id
     */
    public Label getLabel(String id) {
        return null;
    }

    /**
     *
     * @param name Search string
     * @param limit max number of labels to return
     * @return labels matching the @name
     */
    public List<Label> getLabelsByName(String name, int limit) {
        return null;
    }

    /**
     *
     * @param location search string
     * @param limit max number of labels to return
     * @return labels matching the @location
     */
    public List<Label> getLabelsByLocation(String location, int limit) {
        return null;
    }

    /**
     *
     * @param label Label to add in the database
     * @return The Label that was added
     */
    public Label add(Label label) {
        return null;
    }

    /**
     *
     * @param id id of the Label
     * @return The Label that was updated
     */
    public Label update(String id) {
        return null;
    }
}
