package com.vmware.ramkumar;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

	private List<Movie> movies = new ArrayList<Movie>();

	public MovieService(String title) {
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public int getCount() {
		return movies.size();
	}

	public void removeByName(String movie) throws MovieException {
		if (movies.size() == 0) 
			throw new MovieException ("There are no movies in the service");

		for (Movie m : movies) {
			if (m.getName().equals(movie)) {
				// if (m.toString().equalsIgnoreCase(movie)) {
				movies.remove(m);
				return;
			}
		}
		throw new MovieException("That movie does not exist in the service");

	}

}
