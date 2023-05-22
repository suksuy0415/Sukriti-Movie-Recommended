package com.niit.recommended.service;

import com.niit.recommended.domain.Genre;
import com.niit.recommended.domain.Movie;

import java.util.List;

public interface RecommendedForUser {

    public List<Movie> getRecommendedList();


    public List<Genre> getGenreList();

    public List<Movie> getMovieListByGenreName(String name);

    public List<Movie> getMovieListByMovieName(String movieName);

    public List<Movie> searchMovieListByMovieName(String movieName);




//    public String getMovieIdByGenre(String name);




}
