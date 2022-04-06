package com.sparta.mv;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class ConnectionManager {

    private static final String BASEURL = "https://swapi.dev/api/people/";
    private static String endPoint = "";
    private static HttpResponse response = null;

    public static HttpResponse<String> getConnection(){
        return getResponse();
    }

    public static HttpResponse<String> getConnection(int people){
        endPoint = String.valueOf(people);
        return getResponse();
    }

    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(BASEURL + endPoint))
                .build();
        try {
            response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }


    public static Integer getStatusCode() {
        return response.statusCode();
    }

    public static String getHeader(String key) {
        return response.headers().allValues(key).get(0);
    }

    public static Map<String, List<String>> getHeaders(){
        return response.headers().map();
    }

    public static Object getBody(){
        return response.body();
    }

    public static String getURL() {
        return BASEURL + endPoint;
    }
}
