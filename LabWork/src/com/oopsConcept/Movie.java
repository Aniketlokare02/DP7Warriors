package com.oopsConcept;

public class Movie {
	
	private int mId;
	private String mName;
	private float rating;
	
	public Movie(int mId, String mName, float rating) {
		this.mId=mId;
		this.mName=mName;
		this.rating=rating;
	}

	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "mId=" + mId + ", mName=" + mName + ", rating=" + rating;
	}
	
}
