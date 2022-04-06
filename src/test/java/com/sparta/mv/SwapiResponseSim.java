package com.sparta.mv;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SwapiResponseSim {

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("skin_color")
    private String skinColor;

    @JsonProperty("edited")
    private String edited;

    @JsonProperty("created")
    private String created;

    @JsonProperty("mass")
    private String mass;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("url")
    private String url;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("birth_year")
    private String birthYear;

    @JsonProperty("eye_color")
    private String eyeColor;

    @JsonProperty("species")
    private List<Object> species;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private String height;

    public boolean isNameString(){
        return name.getClass() == String.class;
    }

    public boolean isHairColorString(){
        return hairColor.getClass() == String.class;
    }

    public boolean isSkinColorString(){
        return skinColor.getClass() == String.class;
    }

    public boolean isEyeColorString(){
        return eyeColor.getClass() == String.class;
    }

    public boolean isGenderString(){
        return gender.getClass() == String.class;
    }

    public boolean isHomeworldURLValid(){
        return homeworld.matches("https:\\/\\/swapi.dev\\/api\\/planets\\/d+");
    }







}
