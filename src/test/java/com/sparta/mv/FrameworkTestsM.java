package com.sparta.mv;

import org.junit.jupiter.api.*;

import static com.sparta.mv.ConnectionManager.getResponse;
import static com.sparta.mv.SwapiResponseM.*;
import static com.sparta.mv.ConnectionManager.getStatusCode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrameworkTestsM {

    SwapiResponseM response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getResponse(1));
    }

    @Nested
    @DisplayName("Check Value Types Populated")
    class CheckValueTypesExist{

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
    }

}
