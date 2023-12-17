package com.enumpackage;

public enum MovieSeats {
	
	STANDARD(300), PREMIUM(450), RECLINER(600);
	
	int price;
	
	private MovieSeats(int price) {
		this.price=price;
	}

}
