package mongo.models;

public class Track extends Entity {
    @Override
    EntityType getEntityType() {
        return EntityType.TRACK;
    }
}
