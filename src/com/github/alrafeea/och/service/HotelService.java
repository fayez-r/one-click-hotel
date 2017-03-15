package com.github.alrafeea.och.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.alrafeea.och.bean.Hotel;
import com.github.alrafeea.och.bean.SearchInfo;
import com.github.alrafeea.och.util.JSONParser;

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
	public List<ResultInfo> searchHotels(String city, String from, String to,
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

		List<ResultInfo> resultInfo = getHotelsInfo(searchInfo);
		sortByPrice(resultInfo);
		
		return resultInfo;

	}

	private List<ResultInfo> getHotelsInfo(SearchInfo searchInfo) {

		List<ResultInfo> hotelsInfo = new ArrayList<>();

		for (Hotel hotel : searchInfo.getOffers().getHotels()) {

			ResultInfo resultInfo = new ResultInfo();
			resultInfo.setAddress(hotel.getHotelInfo().getHotelStreetAddress());
			resultInfo.setDescription(hotel.getHotelInfo().getDescription());
			resultInfo.setImageUrl(hotel.getHotelInfo().getHotelImageUrl());
			resultInfo.setName(hotel.getHotelInfo().getHotelName());
			resultInfo.setPrice(hotel.getHotelPricingInfo()
					.getTotalPriceValue());
			resultInfo.setCurrency(hotel.getHotelPricingInfo().getCurrency());
			resultInfo.setRate(Double.parseDouble(hotel.getHotelInfo()
					.getHotelStarRating()));

			hotelsInfo.add(resultInfo);
		}

		return hotelsInfo;
	}
	
	private void sortByPrice(List<ResultInfo> hotels){
		
		Collections.sort(hotels, new Comparator<ResultInfo>() {
		    @Override
		    public int compare(ResultInfo h1, ResultInfo h2) {
		        return (int) h1.getPrice() - (int) h2.getPrice();
		    }
		});
	}
}
