package com.niit.recommended.service;

import com.niit.recommended.domain.Genre;
import com.niit.recommended.domain.Movie;

import java.util.List;

public interface RecommendedForUser {

    public List<Movie> getRecommendedList();

    public List<Movie> getRecommendedList(String name);

    public List<Movie> getMovieListByGenreName(String name);

    public List<Movie> getMovieListByMovieName(String movieName);

    public  List<Movie> getMovieListByName(String original_title);

//    public String getMovieIdByGenre(String name);




}
