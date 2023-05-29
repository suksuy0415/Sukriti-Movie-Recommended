package com.niit.recommended.service;

import com.niit.recommended.domain.Cast;
import com.niit.recommended.domain.Movie;

import java.util.List;

public interface ThirdPartyApiService {


    public List<Cast> getCastForMovies(String name);
    public List<Movie> getMovieListActionGenre();
    public List<Movie> getMovieListComedyGenre();
    public List<Movie> getMovieListCrimeGenre();
    public List<Movie> getMovieListFamilyGenre();
}
