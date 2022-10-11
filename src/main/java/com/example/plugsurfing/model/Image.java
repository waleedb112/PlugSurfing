package com.example.plugsurfing.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Image {
    private List<ImageDetail> images;
    private String release;
}
