package com.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.mv.ConnectionManager.*;

public class FrameworkTests {

    SwapiResponse response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getResponse(1));
    }

    @Test
    @DisplayName("test status is ok")
    void testStatusIsOk() {
        Assertions.assertEquals(200, getStatusCode());
    }

    @Test
    @DisplayName("test response is not null")
    void testResponseIsNotNull() {
        Assertions.assertNotNull(response);
    }

    @Test
    @DisplayName("test header content type is correct")
    void testHeaderContentTypeIsCorrect() {
        Assertions.assertEquals("application/json",getContentType());
    }

    @Test
    @DisplayName("Is vehicles a valid http")
    void isVehiclesAValidHttp() {
        Assertions.assertTrue(response.isVehiclesValidUrl());
    }
    @Test
    @DisplayName("Is films a valid http")
    void isFilmsAValidHttp() {
        Assertions.assertTrue(response.isFilmsValidUrl());
    }
    @Test
    @DisplayName("Is starships a valid http")
    void isStarshipsAValidHttp() {
        Assertions.assertTrue(response.isStarshipsValidUrl());
    }
    @Test
    @DisplayName("Is species a valid http")
    void isSpeciesAValidHttp() {
        Assertions.assertTrue(response.isSpeciesValidUrl());
    }

    @Test
    @DisplayName("If Films Exist")
    void ifFilmsExist() {
        Assertions.assertTrue(response.hasFilms());
    }

    @Test
    @DisplayName("If HomeWorld Exist")
    void ifHomeWorldExists() {
        Assertions.assertTrue(response.hasHomeWorld());
    }

    @Test
    @DisplayName("If Starships Exist")
    void ifStarshipsExist() {
        Assertions.assertTrue(response.hasStarships());
    }

    @Test
    @DisplayName("If Vehicles Exist")
    void ifVehiclesExist() {
        Assertions.assertTrue(response.hasVehicles());
    }

    @Test
    @DisplayName("If Species Exists")
    void ifSpeciesExists() {
        Assertions.assertTrue(response.hasSpecies());
    }

    @Test
    @DisplayName("If Gender Exists")
    void ifGenderExists() {
        Assertions.assertTrue(response.hasGender());
    }

    @Test
    @DisplayName("test name is a string")
    void testNameIsAString() {
        Assertions.assertTrue(response.isNameString());
    }

    @Test
    @DisplayName("test hair color is a string")
    void testHairColorIsAString() {
        Assertions.assertTrue(response.isHairColorString());
    }

    @Test
    @DisplayName("test skin color is a string")
    void testSkinColorIsAString() {
        Assertions.assertTrue(response.isSkinColorString());
    }

    @Test
    @DisplayName("test eye color is a string")
    void testEyeColorIsAString() {
        Assertions.assertTrue(response.isEyeColorString());
    }

    @Test
    @DisplayName("test gender is a string")
    void testGenderIsAString() {
        Assertions.assertTrue(response.isGenderString());
    }

    @Test
    @DisplayName("test homeworld is a valid url")
    void testHomeworldIsAValidUrl() {
        Assertions.assertTrue(response.isHomeworldURLValid());
    }

}
