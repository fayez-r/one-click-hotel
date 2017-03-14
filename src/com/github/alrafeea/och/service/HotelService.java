package com.github.alrafeea.och.service;

import java.io.IOException;

import com.github.alrafeea.och.bean.SearchInfo;
import com.github.alrafeea.och.util.JSONParser;
import org.springframework.stereotype.Service;

/**
 * Search hotels with specific information. Information source is Expedia.
 *  
 * @author Fayez Alrafeea
 *
 */
@Service("hs")
public class HotelService {

	/**
	 * URL for Expedia information source.
	 */
	public static final String searchUrl = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	/**
	 * Search for hotels with specific criteria.
	 * 
	 * @param city
	 * @param from
	 * @param to
	 * @param minStar
	 * @param maxStar
	 * @return list of hotels
	 */
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
