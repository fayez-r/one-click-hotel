package com.github.alrafeea.och.bean;

public class HotelScores {

	private double rawAppealScore;
	private double movingAverageScore;

	public double getMovingAverageScore() {
		return movingAverageScore;
	}

	public void setMovingAverageScore(double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	public double getRawAppealScore() {
		return rawAppealScore;
	}

	public void setRawAppealScore(double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

}