package com.sparta.mv;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Injector {

    public static SwapiResponse injectDTO(String URL){
        SwapiResponse swapiResponse = new SwapiResponse();
        ObjectMapper mapper = new ObjectMapper();
        try {
            swapiResponse = mapper.readValue(new URL(URL),SwapiResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return swapiResponse;
    }
}
