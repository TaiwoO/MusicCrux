package com.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Release {
    @JsonProperty("id")
    private Long discogs_id;

    private String country;
    private String title;
    private String released;

    private List<Track> tracks;

    @JsonProperty("tracklist")
    private void unpackTracksFromNestedObject(Map<String, List<Track>> trackList) {
        this.tracks = trackList.get("track");
    }

    private List<Artist> contributors;

    @JsonProperty("extraartists")
    private void unpackArtistsFromNestedObject(Object node) {
        this.contributors = new ArrayList<Artist>();

        if (node instanceof String) { // The json doesn't have the 'artist' field
            return;
        } else if (node instanceof Map<?, ?>) {

            Map<String, Object> nodeMap = (Map<String, Object>) node;

            if (nodeMap.get("artist") instanceof List<?>) { // list of artists
                List<Map<String, Object>> artistNodes = (List<Map<String, Object>>) nodeMap.get("artist");
                for (Map<String, Object> artistNode : artistNodes) {
                    Artist artist = new Artist();
                    artist.setName(String.valueOf(artistNode.get("name")));
                    artist.setDiscogs_id(Integer.toUnsignedLong((int) artistNode.get("id")));
                    this.contributors.add(artist);

                }
            } else { // a single object
                Map<String, Object> artistNode = (Map<String, Object>) nodeMap.get("artist");
                Artist artist = new Artist();
                artist.setName(String.valueOf(artistNode.get("name")));
                artist.setDiscogs_id(Integer.toUnsignedLong((int) artistNode.get("id")));
                this.contributors.add(artist);
            }
        }
    }

    private List<Label> labels;

    @JsonProperty("labels")
    private void unpackLabelsFromNestedObject(Map<String, List<Label>> labels) {
        this.labels = labels.get("label");
    }

    private List<Artist> creators;

    @JsonProperty("artists")
    private void unpackCreatorsFromNestedObject(Object node) {
        this.creators = new ArrayList<Artist>();
        if (node instanceof String) { // The json doesn't have the 'artist' field
            return;
        } else if (node instanceof Map<?, ?>) {
            Map<String, Object> nodeMap = (Map<String, Object>) node;

            if (nodeMap.get("artist") instanceof List<?>) { // list of artists
                List<Map<String, Object>> artistNodes = (List<Map<String, Object>>) nodeMap.get("artist");
                for (Map<String, Object> artistNode : artistNodes) {
                    Artist artist = new Artist();
                    artist.setName(String.valueOf(artistNode.get("name")));
                    artist.setDiscogs_id(Integer.toUnsignedLong((int) artistNode.get("id")));
                    this.creators.add(artist);
                }
            } else { // a single object
                Map<String, Object> artistNode = (Map<String, Object>) nodeMap.get("artist");
                Artist artist = new Artist();
                artist.setName(String.valueOf(artistNode.get("name")));
                artist.setDiscogs_id(Integer.toUnsignedLong((int) artistNode.get("id")));
                this.creators.add(artist);
            }
        }
    }

    private List<String> genres;

    @JsonProperty("genres")
    private void unpackGenresFromNestedObject(Object node) {
        this.genres = new ArrayList<String>();
        if (node instanceof String) { // Empty
            return;
        } else if (node instanceof Map<?, ?>) {
            Map<String, Object> nodeMap = (Map<String, Object>) node;

            if (nodeMap.get("genre") instanceof List<?>) { // list of genres
                List<String> genres = (List<String>) nodeMap.get("genre");
                for (String genre : genres) {
                    this.genres.add(genre);
                }
            } else { // a single object
                String genre = (String) nodeMap.get("genre");
                this.genres.add(genre);
            }
        }
    }

    private List<String> styles;

    @JsonProperty("styles")
    private void unpackStylesFromNestedObject(Object node) {
        this.styles= new ArrayList<String>();
        if (node instanceof String) { // Empty
            return;
        } else if (node instanceof Map<?, ?>) {
            Map<String, Object> nodeMap = (Map<String, Object>) node;

            if (nodeMap.get("style") instanceof List<?>) { // list of styles
                List<String> styles = (List<String>) nodeMap.get("style");
                for (String style : styles) {
                    this.styles.add(style);
                }
            } else { // a single object
                String style = (String) nodeMap.get("style");
                this.styles.add(style);
            }
        }
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Track {
        private String title;
        private String position;
        private String duration;

        public String getTitle() {
            return title;
        }

        public String getPosition() {
            return position;
        }

        public String getDuration() {
            return duration;
        }

        @Override
        public String toString() {
            return "Track [title=" + title + ", position=" + position + ", duration=" + duration + "]";
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Label {
        private long id;
        private String name;
        private String catno;

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getCatno() {
            return catno;
        }

        @Override
        public String toString() {
            return "Label [id=" + id + ", name=" + name + ", catno=" + catno + "]";
        }

    }


}