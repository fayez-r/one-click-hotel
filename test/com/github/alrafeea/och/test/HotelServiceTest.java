package com.github.alrafeea.och.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.github.alrafeea.och.bean.Hotel;
import com.github.alrafeea.och.bean.SearchInfo;
import com.github.alrafeea.och.service.HotelService;

/**
 * Test class for HotelService.
 * 
 * @author Fayez Alrafeea
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class HotelServiceTest {

	// DI
	@Autowired
	@Qualifier("hs")
	HotelService hs;

	/**
	 * Test hotels count.
	 */
	@Test
	public void testHotelsCount() {

		SearchInfo searchInfo = hs.searchHotels("Seattle", "2017-01-15",
				"2017-05-10", "1", "5");

		// assert getting result from Expedia
		Assert.notNull(searchInfo);

		// assert number of hotels
		Assert.isTrue(searchInfo.getOffers().getHotels().size() == 50);

	}

	/**
	 * Test destination information.
	 */
	@Test
	public void testDestination() {

		SearchInfo searchInfo = hs.searchHotels("Seattle", "2017-01-15",
				"2017-05-10", "1", "5");

		for (Hotel hotel : searchInfo.getOffers().getHotels()) {

			// test city name
			Assert.isTrue(hotel.getHotelInfo().getHotelCity().equals("Seattle"));

		}
	}

	/**
	 * Test dates of offer.
	 */
	@Test
	public void testDates() {

		SearchInfo searchInfo = hs.searchHotels("Seattle", "2017-01-15",
				"2017-05-10", "1", "5");

		for (Hotel hotel : searchInfo.getOffers().getHotels()) {

			Assert.isTrue(hotel.getHotelInfo().getHotelCity().equals("Seattle"));

			int[] offerStartDate = hotel.getOfferDateRange()
					.getTravelStartDate();
			int[] offerEndDate = hotel.getOfferDateRange().getTravelStartDate();
			
			// test month and year
			Assert.isTrue((offerStartDate[0] == 2017));
			Assert.isTrue((offerEndDate[0] == 2017));
			Assert.isTrue((offerStartDate[1] >= 1));
			Assert.isTrue((offerEndDate[1] <= 5));
		}
	}
}
