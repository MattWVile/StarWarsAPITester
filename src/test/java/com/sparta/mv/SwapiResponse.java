package com.sparta.mv;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SwapiResponse{

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

	public List<String> getFilms(){
		return films;
	}

	public String getHomeworld(){
		return homeworld;
	}

	public String getGender(){
		return gender;
	}

	public String getSkinColor(){
		return skinColor;
	}

	public String getEdited(){
		return edited;
	}

	public String getCreated(){
		return created;
	}

	public String getMass(){
		return mass;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public String getUrl(){
		return url;
	}

	public String getHairColor(){
		return hairColor;
	}

	public String getBirthYear(){
		return birthYear;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public List<Object> getSpecies(){
		return species;
	}

	public List<String> getStarships(){
		return starships;
	}

	public String getName(){
		return name;
	}

	public String getHeight(){
		return height;
	}

	public boolean isFilmsValidUrl(){
		int size = getFilms().size();
		int count = 0;
		int i = 0;
		while(i<size) {
			if(getFilms().get(i).matches("https:\\/\\/swapi.dev\\/api\\/films\\/\\d+")){
				count ++;
			}
			i++;
		}
		return size == count && count != 0 ;
	}
	public boolean isVehiclesValidUrl(){
		int size = getVehicles().size();
		int i = 0;
		int count = 1;
		while(i<size) {
			if (getVehicles().get(i).matches("https:\\/\\/swapi.dev\\/api\\/vehicles\\/\\d+")) {
				count ++;
			}
			i++;
		}
		return size == count && count != 0;

	}
	public boolean isSpeciesValidUrl(){
		int size = getSpecies().size();
		int count = 1;
		int i = 0;
		while(i<size) {
			if (getSpecies().get(i).toString().matches("https:\\/\\/swapi.dev\\/api\\/species\\/\\d+")) {
				count ++;
			}
			i++;
		}
		return size == count && count != 0;
	}
	public boolean isStarshipsValidUrl(){
		int size = getStarships().size();
		int count = 1;
		int i = 0;
		while(i<size) {
			if (getStarships().get(i).matches("https:\\/\\/swapi.dev\\/api\\/starships\\/\\d+")) {
				count ++;
			}
			i++;
		}
		return size == count && count != 0;
	}

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

	public boolean hasFilms(){
		return films != null;
	}

	public boolean hasHomeWorld(){
		return homeworld != null;
	}

	public boolean hasGender(){
		return gender != null;
	}

	public boolean hasSkinColor(){
		return skinColor != null;
	}

	public boolean hasEdited(){
		return edited != null;
	}

	public boolean hasCreated(){
		return created != null;
	}

	public boolean hasMass(){
		return mass != null;
	}

	public boolean hasVehicles(){
		return vehicles != null;
	}

	public boolean hasUrl(){
		return url != null;
	}

	public boolean hasHairColor(){
		return hairColor != null;
	}

	public boolean hasBirthYear(){
		return birthYear != null;
	}

	public boolean hasEyeColor(){
		return eyeColor != null;
	}

	public boolean hasSpecies(){
		return species != null;
	}

	public boolean hasStarships(){
		return starships != null;
	}

	public boolean hasName(){
		return name != null;
	}

	public boolean hasHeight(){
		return height != null;
	}
}