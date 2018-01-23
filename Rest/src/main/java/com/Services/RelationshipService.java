package com.Services;

import mongo.models.Relationship;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipService {

    /**
     *
     * @param id id of the relationship
     * @return The Relationship matching the id
     */
    public Relationship getRelationship(String id) {

        return null;
    }

    /**
     *
     * @param types
     * @param limit max number of relationships to return
     * @return labels matching the @types
     */
    public List<Relationship> getRelationshipsByTypes(List<String> types, int limit) {
        return null;
    }

    /**
     *
     * @param relationship Relationship to add in the database
     * @return The Relationship that was added
     */
    public Relationship add(Relationship relationship) {
        return null;
    }

    /**
     *
     * @param id
     * @return The Relationship that was updated
     */
    public Relationship update(String id) {
        return null;
    }
}
