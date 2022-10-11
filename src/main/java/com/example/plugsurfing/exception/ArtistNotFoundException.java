package com.example.plugsurfing.exception;

import java.io.Serial;

public class ArtistNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public ArtistNotFoundException(String msg) {
        super(msg);
    }
}
