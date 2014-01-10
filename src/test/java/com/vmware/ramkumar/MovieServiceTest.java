package com.vmware.ramkumar;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MovieServiceTest {

	@Test
	public void addTwoMovieAbdGetTheTotal() {
		// Subject Under Test
		MovieService movieService = new MovieService("VMware Movie Night");
		movieService.addMovie(new Movie("E.T. - Extra Terrestrial"));
		movieService.addMovie(new Movie("Wall-E"));
		assertEquals(movieService.getCount(), 2);
	}

	@Test
	public void addOneMovieAbdGetTheTotal() {
		// Subject Under Test
		MovieService movieService = new MovieService("VMware Movie Night");
		movieService.addMovie(new Movie("E.T. - Extra Terrestrial"));
		assertEquals(movieService.getCount(), 1);
	}

	@Test
	public void getTheTotalWithNoMovies() {
	}

}
