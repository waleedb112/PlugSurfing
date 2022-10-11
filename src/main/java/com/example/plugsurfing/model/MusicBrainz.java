package com.example.plugsurfing.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

/**
 * This is the model for MusicBrainz,the fields are selected according to the response coming from the API.
 */
@Getter
public class MusicBrainz {
    private String id;
    private String name;
    private String gender;
    private String country;
    private String disambiguation;
    //private List<Relation> relations;
    @JsonProperty("release-groups")
    private List<Release> releaseGroups;
}
