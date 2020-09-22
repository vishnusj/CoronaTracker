package com.javaapp.covidtracker;

public class LocationStats {
	
	private String state;
	private String country;
	private int latestnumbers;
	private int diffFromPrevDay;
	
	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestnumbers() {
		return latestnumbers;
	}
	public void setLatestnumbers(int latestnumbers) {
		this.latestnumbers = latestnumbers;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestnumbers=" + latestnumbers + "]";
	}
	
	
	

}
