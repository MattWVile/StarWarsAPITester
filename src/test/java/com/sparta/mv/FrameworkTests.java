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



}
