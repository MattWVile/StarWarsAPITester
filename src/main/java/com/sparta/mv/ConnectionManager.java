package com.sparta.mv;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {
    private static final String BASEURL = "https://swapi.dev/api/people/";
    private static int endPoint;


    public static String getConnection() {
        getResponse();
        return BASEURL;
    }
    public static String getConnection(int people) {
        getResponse();
        endPoint = people;
        return BASEURL + people;
    }

    public static int getStatusCode() {
        return getResponse().statusCode();
    }

    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASEURL + endPoint)).build();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    public String getURL() {
        return BASEURL + endPoint;
    }
}