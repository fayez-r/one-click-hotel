package com.github.alrafeea.och.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.alrafeea.och.bean.SearchInfo;
import com.github.alrafeea.och.service.HotelService;

/**
 * The controller layer for hotels service.
 * 
 * @author Fayez Alrafeea
 *
 */
@Controller
public class SearchController {

	/**
	 * Search hotels with provided criteria.
	 * 
	 * @param city
	 * @param from
	 * @param to
	 * @param minStar
	 * @param maxStar
	 * @return model and view
	 */
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam(value = "city") String city,
			@RequestParam(value = "from") String from,
			@RequestParam(value = "to") String to,
			@RequestParam(value = "minStar") String minStar,
			@RequestParam(value = "maxStar") String maxStar) {

		HotelService searchHandler = new HotelService();
		SearchInfo searchInfo = searchHandler.searchHotels(city, from, to, minStar, maxStar);

		return new ModelAndView("search-result", "searchInfo", searchInfo);

	}
}
