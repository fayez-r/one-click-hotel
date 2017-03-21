package com.github.alrafeea.och.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.github.alrafeea.och.service.HotelService;
import com.github.alrafeea.och.service.ResultInfo;

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

		List<ResultInfo> searchInfo = hs.searchHotels("Seattle", "2017-01-15",
				"2017-05-10", "1", "5");

		// assert getting result from Expedia
		Assert.notNull(searchInfo);

		// assert number of hotels
		Assert.isTrue(searchInfo.size() == 50);

	}

	/**
	 * Test destination information.
	 */
	@Test
	public void testDestination() {

		List<ResultInfo> searchInfo = hs.searchHotels("Seattle", "2017-01-15",
				"2017-05-10", "1", "5");

		for (ResultInfo hotelInfo : searchInfo) {

			// test city name
			Assert.isTrue(hotelInfo.getCity().equals("Seattle"));

		}
	}

	/**
	 * Test dates of offer.
	 */
	@Test
	public void testDates() {

		List<ResultInfo> searchInfo = hs.searchHotels("Seattle", "2017-01-15",
				"2017-05-10", "1", "5");

		for (ResultInfo hotelInfo : searchInfo) {

			int[] offerStartDate = hotelInfo.getTravelStartDate();
			int[] offerEndDate = hotelInfo.getTravelEndDate();
			
			// test month and year
			Assert.isTrue((offerStartDate[0] == 2017));
			Assert.isTrue((offerEndDate[0] == 2017));
			Assert.isTrue((offerStartDate[1] >= 1));
			Assert.isTrue((offerEndDate[1] <= 5));
		}
	}
}
