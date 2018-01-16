package mongo.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Album extends Entity{


	private String country;
	private String title;
	private String releaseDate;

	private List<Track> tracks;
	private List<Artist> contributors;
	private List<Label> labels;
	private List<Entity> creators;
	private List<String> genres;
	private List<String> subGenres;

	@Override
	EntityType getEntityType() {
		return EntityType.ALBUM;
	}
}
