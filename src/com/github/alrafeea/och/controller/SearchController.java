package com.github.alrafeea.och.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.alrafeea.och.bean.SearchInfo;
import com.github.alrafeea.och.hotel.SearchHandler;


@Controller
public class SearchController {

	@RequestMapping("/search")
	public ModelAndView helloWorld(@RequestParam(value = "city") String city,
			@RequestParam(value = "from") String from,
			@RequestParam(value = "to") String to,
			@RequestParam(value = "minStar") String minStar,
			@RequestParam(value = "maxStar") String maxStar) {

		SearchHandler searchHandler = new SearchHandler();
		SearchInfo searchInfo = searchHandler.searchHotels(city, from, to, minStar, maxStar);

		return new ModelAndView("search-result", "searchInfo", searchInfo);

	}
}
