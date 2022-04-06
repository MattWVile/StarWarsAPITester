package com.sparta.mv;

import org.junit.jupiter.api.*;

import static com.sparta.mv.ConnectionManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrameworkTestsM {

    SwapiResponse response;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getResponse(1));
    }


    @Nested
    @DisplayName("Testing The Values Exist")
    class TestValuesExist {

        @Test
        @DisplayName("If Skin Color Exists")
        void ifSkinColorExists() {
            Assertions.assertTrue(response.hasSkinColor());
        }

        @Test
        @DisplayName("If Edited Exists")
        void ifEditedExists() {
            Assertions.assertTrue(response.hasEdited());
        }

        @Test
        @DisplayName("If Created Exists")
        void ifCreatedExists() {
            Assertions.assertTrue(response.hasCreated());
        }

        @Test
        @DisplayName("If Mass Exists")
        void ifMassExists() {
            Assertions.assertTrue(response.hasMass());
        }

        @Test
        @DisplayName("If Url Exists")
        void ifUrlExists() {
            Assertions.assertTrue(response.hasUrl());
        }

        @Test
        @DisplayName("If Hair Colour Exists")
        void ifHairColourExists() {
            Assertions.assertTrue(response.hasHairColor());
        }

        @Test
        @DisplayName("If Birth Year Exists")
        void ifBirthYearExists() {
            Assertions.assertTrue(response.hasBirthYear());
        }

        @Test
        @DisplayName("If Eye Color Exists")
        void ifEyeColorExists() {
            Assertions.assertTrue(response.hasEyeColor());
        }

        @Test
        @DisplayName("If Name Exists")
        void ifNameExists() {
            Assertions.assertTrue(response.hasName());
        }

        @Test
        @DisplayName("If Height Exists")
        void ifHeightExists() {
            Assertions.assertTrue(response.hasHeight());
        }

    }

}
