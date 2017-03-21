package com.github.alrafeea.och.service;

/**
 * Information to be displayed in view.
 * 
 * @author Fayez Alrafeea
 *
 */
public class ResultInfo {

	/**
	 * Hotel name
	 */
	private String name;

	/**
	 * Hotel description
	 */
	private String description;

	/**
	 * Hotel address
	 */
	private String address;

	/**
	 * Hotel image URL
	 */
	private String imageUrl;

	/**
	 * Hotel rate
	 */
	private double rate;

	/**
	 * Price per night
	 */
	private double price;

	/**
	 * Hotel pricing currency
	 */
	private String currency;

	/**
	 * City name
	 */
	private String city;

	/**
	 * Travel start date
	 */
	private int[] travelStartDate;

	/**
	 * Travel end date
	 */
	private int[] travelEndDate;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate
	 *            the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the travelStartDate
	 */
	public int[] getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * @param travelStartDate
	 *            the travelStartDate to set
	 */
	public void setTravelStartDate(int[] travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * @return the travelEndDate
	 */
	public int[] getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * @param travelEndDate
	 *            the travelEndDate to set
	 */
	public void setTravelEndDate(int[] travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

}
