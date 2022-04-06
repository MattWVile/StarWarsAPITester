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
        response = Injector.injectDTO(getConnection(2));
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

}
