package pl.movie.rental.service;

import java.util.List;

import org.springframework.data.domain.Page;

import pl.movie.rental.commands.GetMovieCommand;
import pl.movie.rental.commands.SearchCriteriaCommand;
import pl.movie.rental.model.Movie;

public interface MovieService {

	Movie addMovie(Movie movie);

	Movie findMovieById(Long id);

	Page<Movie> findMoviesByCriteria(GetMovieCommand getMoviesCommand, SearchCriteriaCommand searchCriteriaCommand);

	List<Movie> findAllMovies();
}
