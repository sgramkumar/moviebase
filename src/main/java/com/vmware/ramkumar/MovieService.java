package com.vmware.ramkumar;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

	private int count = 0;
	private List<Movie> movies = new ArrayList<Movie>();

	public MovieService(String title) {
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
		count++;
	}

	public int getCount() {
		return count;
	}

	public void removeByName(String movie) throws MovieException {
		if (count == 0) 
			throw new MovieException ("There are no movies in the service");

		for (Movie m : movies) {
			if (m.getName().equals(movie)) {
			// if (m.toString().equalsIgnoreCase(movie)) {
				movies.remove(m);
				count--;
				return;
			}
		}
		throw new MovieException("That movie does not exist in the service");

	}

}
