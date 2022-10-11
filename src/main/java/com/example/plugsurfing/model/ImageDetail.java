package com.example.plugsurfing.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ImageDetail {
    private String id;
    @JsonProperty("image")
    private String imageUrl;
}
