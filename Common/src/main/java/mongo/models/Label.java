package mongo.models;

import lombok.Data;

@Data
public class Label extends Entity {

    @Override
    EntityType getEntityType() {
        return EntityType.LABEL;
    }
}
