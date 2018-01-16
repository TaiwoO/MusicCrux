package mongo.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public abstract class Entity {
    @Id
    private String id;
    @Indexed
    private String label; // artist name, band name, etc

    abstract EntityType getEntityType();
}
