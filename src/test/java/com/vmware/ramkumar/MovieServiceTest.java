package com.vmware.ramkumar;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MovieServiceTest {

	private MovieService movieService;

	@BeforeMethod
	public void setUp() {
		// Subject Under Test
		movieService = new MovieService("VMware Movie Night");

	}
	@Test
	public void addTwoMovieAbdGetTheTotal() {
		movieService.addMovie(new Movie("E.T. - Extra Terrestrial"));
		movieService.addMovie(new Movie("Wall-E"));
		assertEquals(movieService.getCount(), 2);
	}

	@Test
	public void addOneMovieAbdGetTheTotal() {
		movieService.addMovie(new Movie("E.T. - Extra Terrestrial"));
		assertEquals(movieService.getCount(), 1);
	}

	@Test
	public void getTheTotalWithNoMovies() {
		assertEquals(movieService.getCount(), 0);

	}
/*
	@Test
	public void removeAMovieAndGettheTotal() throws MovieException {
		movieService.addMovie(new Movie("E.T. - Extra Terrestrial"));
		movieService.addMovie(new Movie("Wall-E"));
		movieService.removeByName("Wall-E");

		assertEquals(movieService.getCount(), 1);
	}

	@Test
	public void removeAMovieFromAnEmptyService() {
		try {
			movieService.removeByName("Wall-E");
			fail("Was expecting an exception in removeAMovieFromAnEmptyService()");
		} catch (MovieException e) {
			assertEquals(e.getMessage(), "There are no movies in the service");
		}
	}
/*
	@Test
	public void removeAMovieTitanicDoesntExist() {
		movieService.addMovie(new Movie("E.T. - Extra Terrestrial"));
		movieService.addMovie(new Movie("Wall-E"));

		try {
			movieService.removeByName("Titanic");
			fail("Was expecting an exception in removeAMovieThatDoesntExist()");
		} catch (MovieException e) {
			assertEquals(e.getMessage(), "That movie does not exist in the service");
		}
	}

	@Test
	public void removeAMovieTestDoesntExist() {
		movieService.addMovie(new Movie("E.T. - Extra Terrestrial"));
		movieService.addMovie(new Movie("Wall-E"));

		try {
			movieService.removeByName("Test");
			fail("Was expecting an exception in removeAMovieThatDoesntExist()");
		} catch (MovieException e) {
			assertEquals(e.getMessage(), "That movie does not exist in the service");
		}
	}
	*/
}
