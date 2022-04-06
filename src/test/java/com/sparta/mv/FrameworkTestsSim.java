package com.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.mv.ConnectionManager.getResponse;

public class FrameworkTestsSim {

    SwapiResponseSim response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getResponse(1));
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
