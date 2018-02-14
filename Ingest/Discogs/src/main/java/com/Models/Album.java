package com.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

//GSON nested JSON to Java Objects
@Data
public class Album {

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("tracklist")
    @Expose
    private Tracklist tracklist;

    @SerializedName("identifiers")
    @Expose
    private Identifiers identifiers;

    @SerializedName("extraArtists")
    @Expose
    private Extraartists extraartists;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("companies")
    @Expose
    private Companies companies;

    @SerializedName("artists")
    @Expose
    private Artists artist;

    @SerializedName("genres")
    @Expose
    private Genres genres;

    @SerializedName("styles")
    @Expose
    private Styles style;

    @Data
    public static class Tracklist {
        @SerializedName("track")
        @Expose
        private List<Track> track = null;
    }

    @Data
    public class Track {
        @SerializedName("duration")
        @Expose
        private String duration;
        @SerializedName("position")
        @Expose
        private String position;
        @SerializedName("title")
        @Expose
        private String title;
    }

    @Data
    public static class Identifiers {
        @SerializedName("identifier")
        @Expose
        private List<Identifier> identifier = null;
    }

    @Data
    public static class Identifier {
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("value")
        @Expose
        private String value;
    }

    @Data
    public static class Extraartists  {
        @SerializedName("artist")
        @Expose
        private Artist artist;
    }

    @Data
    public static class Artist {
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("tracks")
        @Expose
        private String tracks;
    }

    @Data
    public static class Artists {
        @SerializedName("artists")
        @Expose
        private Artist artist;
    }

    @Data
    public static class Genres {
        @SerializedName("genre")
        @Expose
        private List<String> genre = null;

    }

    @Data
    public static class Styles {
        @SerializedName("style")
        @Expose
        private List<String> style = null;

    }

    @Data
    public static class Companies {
        @SerializedName("company")
        @Expose
        List<Company> company;
    }


    @Data
    public static class Company {
        @SerializedName("id")
        @Expose
        private long id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("catno")
        @Expose
        private String catno;
        @SerializedName("entity_type")
        @Expose
        private String entity_type_name;
    }

}
