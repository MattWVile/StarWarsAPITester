package com.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;
import static com.sparta.mv.ConnectionManager.*;

public class ConnectionManagerTests {

    HttpResponse<String> response = null;

    @BeforeEach
    void setup(){
        response = getConnection(1);
    }

    @Test
    @DisplayName("test url is not empty")
    void testUrlIsNotEmpty() {
        Assertions.assertNotEquals("", getURL());
    }

    @Test
    @DisplayName("test get connection return response")
    void testGetConnectionReturnResponse() {
        Assertions.assertNotNull(response);
    }

    @Test
    @DisplayName("test get status code return a number")
    void testGetStatusCodeReturnANumber() {
        Assertions.assertNotNull(getStatusCode());
    }

    @Test
    @DisplayName("test get status code is ok")
    void testGetStatusCodeIsOk() {
        Assertions.assertEquals(200,getStatusCode());
    }

    @Test
    @DisplayName("test one of the headers return a value")
    void testOneOfTheHeadersReturnAValue() {
        Assertions.assertFalse(getHeader("content-type").equals("") && getHeaders() == null);
    }

    @Test
    @DisplayName("test get headers is not null")
    void testGetHeadersReturnAMap() {
        Assertions.assertNotNull(getHeaders());
    }

    @Test
    @DisplayName("test get body is not null")
    void testGetBodyIsNotNull() {
        Assertions.assertNotNull(getBody());
    }

}
