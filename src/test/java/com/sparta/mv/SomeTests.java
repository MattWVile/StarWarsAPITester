package com.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.mv.ConnectionManager.getResponse;

public class SomeTests {

    SwapiResponse response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getResponse(1));
    }

    @Test
    @DisplayName("Is vehicles a valid http")
    void isVehiclesAValidHttp() {
        Assertions.assertTrue(response.isVehiclesValidUrl);
    }
    @Test
    @DisplayName("Is films a valid http")
    void isFilmsAValidHttp() {
        Assertions.assertTrue(response.isFilmsValidUrl);
    }
    @Test
    @DisplayName("Is starships a valid http")
    void isStarshipsAValidHttp() {
        Assertions.assertTrue(response.isStarshipsValidUrl);
    }
    @Test
    @DisplayName("Is species a valid http")
    void isSpeciesAValidHttp() {
        Assertions.assertTrue(response.isSpeciesValidUrl);
    }
}
