package com.vmware.ramkumar;

public class MovieService {

	private int count = 0;
	public MovieService(String title) {
		// TODO Auto-generated constructor stub
	}

	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		count++;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public void removeByName(String movie) {
		// TODO Auto-generated method stub
		count--;
	}

}
