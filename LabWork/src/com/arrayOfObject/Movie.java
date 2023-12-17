package com.arrayOfObject;

public class Movie {
	
	private int mId;
	private String mName;
	private float rating;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int mId, String mName, float rating) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.rating = rating;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [mId=" + mId + ", mName=" + mName + ", rating=" + rating + "]";
	}

}
