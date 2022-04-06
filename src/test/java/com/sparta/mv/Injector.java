package com.sparta.mv;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.net.http.HttpResponse;

public class Injector {

    public static SwapiResponse injectDTO(HttpResponse<String> response){
        SwapiResponse swapiResponse = new SwapiResponse();
        ObjectMapper mapper = new ObjectMapper();
        try {
            swapiResponse = mapper.readValue(response.body(),SwapiResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return swapiResponse;
    }
}
