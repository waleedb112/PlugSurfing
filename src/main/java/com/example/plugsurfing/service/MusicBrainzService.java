package com.example.plugsurfing.service;

import com.example.plugsurfing.model.Image;
import com.example.plugsurfing.model.MusicBrainz;
import com.example.plugsurfing.model.Release;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class MusicBrainzService {

    private final RestTemplate template = new RestTemplate();

    // Gets the response from the external MusicBrainz Service
    @Cacheable("artist")
    public MusicBrainz findArtist(String id) {
        String url = "http://musicbrainz.org/ws/2/artist/" + id + "?&fmt=json&inc=url-rels+release-groups";

        MusicBrainz artist = template.getForObject(url, MusicBrainz.class);

        Objects.requireNonNull(artist).getReleaseGroups().forEach(release -> {
            release.setImageUrl(getImageUrl(release));
        });
        return artist;
    }

    private String getImageUrl(Release release) {
        String covertArtArchiveUrl = "http://coverartarchive.org/release-group/" + release.getId();
        Image image = template.getForObject(covertArtArchiveUrl, Image.class);
        return Objects.requireNonNull(image).getImages().get(0).getImageUrl();
    }
}
