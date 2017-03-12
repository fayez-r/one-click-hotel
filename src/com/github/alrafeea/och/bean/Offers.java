package com.github.alrafeea.och.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Offers {

	@JsonProperty("Hotel")
	private List<Hotel> hotels;

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

}
