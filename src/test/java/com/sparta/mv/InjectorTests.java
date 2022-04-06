package com.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.http.HttpResponse;

public class InjectorTests {

    private HttpResponse response;
    private SwapiResponse swapiResponse;

    private final static String bodyResponse =
            "{" +
            "\"name\": \"Luke Skywalker\"," +
            "\"height\": \"172\"," +
            "\"mass\": \"77\"," +
            "\"hair_color\": \"blond\"," +
            "\"skin_color\": \"fair\"," +
            "\"eye_color\": \"blue\"," +
            "\"birth_year\": \"19BBY\"," +
            "\"gender\": \"male\"" +
            "}";

    @BeforeEach
    void setup(){
        response = Mockito.mock(HttpResponse.class);
        Mockito.when(response.body()).thenReturn(bodyResponse);
        swapiResponse = Injector.injectDTO(response);
    }

    @Test
    @DisplayName("test injectDTO returns a SwapiResponse not null")
    void testInjectDtoReturnsASwapiResponseIsNotNull() {
        Assertions.assertNotNull(swapiResponse);
        Mockito.verify(response, Mockito.times(1)).body();
    }

    @Test
    @DisplayName("test injectDTO returns a SwapiResponse with some values")
    void testInjectDtoReturnsASwapiResponseWithSomeValues() {
        Assertions.assertEquals("Luke Skywalker", swapiResponse.getName());
        Assertions.assertEquals("172", swapiResponse.getHeight());
        Assertions.assertEquals("blond", swapiResponse.getHairColor());
        Mockito.verify(response, Mockito.times(1)).body();
    }

}
