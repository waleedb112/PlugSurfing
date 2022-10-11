package com.example.plugsurfing.controller;

import com.example.plugsurfing.exception.ArtistNotFoundException;
import com.example.plugsurfing.model.MusicBrainz;
import com.example.plugsurfing.service.MusicBrainzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musify/music-artist")
public class MusicBrainzController {

    @Autowired
    private MusicBrainzService musicBrainzService;

    @GetMapping("/details")
    public ResponseEntity<MusicBrainz> getMusicArtistDetails(@RequestParam String id) {
        try {
            MusicBrainz musicBrainz = musicBrainzService.findArtist(id);
            return new ResponseEntity<>(musicBrainz, HttpStatus.OK);
        } catch (Exception e) {
            throw new ArtistNotFoundException("Artist with " + id + " Not Found");
        }
    }

}
