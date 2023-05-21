package com.niit.recommended.service;

import com.niit.recommended.domain.Genre;
import com.niit.recommended.domain.Movie;
import com.niit.recommended.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecommendedForUserImpl implements RecommendedForUser{



    private MovieRepository movieRepository;

    public RecommendedForUserImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public List<Movie> getRecommendedList() {




        return null;
    }

    @Override
    public List<Movie> getRecommendedList(String name) {
        return null;
    }



   @Override
    public List<Movie> getMovieListByGenreName(String name) {

       List<Genre> genres= movieRepository.getMovieGenreList();
       String id=movieRepository.getGenreIdByMovieName(name , genres);
       List<Movie> movies=movieRepository.movieListByGenreName(id);

         return movies;
    }


    @Override
    public List<Movie> getMovieListByMovieName(String movieName) {

        List<Movie> movie= movieRepository.getMovieList();
        List<Movie> movies=movieRepository.getMovieByMovieName(movieName,movie);

        return movies;
    }

    @Override
    public List<Movie> getMovieListByName(String original_title) {
        return null;
    }
}
