package com.sparta.mv;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {

    private static final String BASEURL = "https://swapi.dev/api/people/";
    private static int endPoint;
    private static HttpResponse response = null;


    public static int getStatusCode() {
        return response.statusCode();
    }

    public static String getContentType(){
        return response.headers().allValues("Content-Type").get(0);
    }

    static HttpResponse<String> getResponse(int people) {
        endPoint = people;
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(BASEURL + people))
                .build();


        try {
            response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }

    public String getURL() {
        return BASEURL + endPoint;
    }
}
