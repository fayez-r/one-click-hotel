package com.github.alrafeea.och.hotel;

import java.io.IOException;

import com.github.alrafeea.och.bean.SearchInfo;
import com.github.alrafeea.och.util.JSONParser;


public class SearchHandler {

	public static final String searchUrl = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	public SearchInfo searchHotels(String city, String from, String to,
			String minStar, String maxStar) {

		StringBuilder searchString = new StringBuilder("");
		if (!city.trim().equals("")) {
			searchString.append("&destinationCity=" + city);
		}

		if (!from.trim().equals("")) {
			searchString.append("&minTripStartDate=" + from);
		}

		if (!to.trim().equals("")) {
			searchString.append("&maxTripStartDate=" + to);
		}

		if (!minStar.trim().equals("")) {
			searchString.append("&minStarRating=" + minStar);
		}

		if (!maxStar.trim().equals("")) {
			searchString.append("&maxStarRating=" + maxStar);
		}

		SearchInfo searchInfo = null;
		try {
			searchInfo = JSONParser.parse(searchUrl + searchString.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

		return searchInfo;
	}
}
