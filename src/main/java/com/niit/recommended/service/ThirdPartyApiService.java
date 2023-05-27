package com.niit.recommended.service;

import com.niit.recommended.domain.Movie;

import java.util.List;

public interface ThirdPartyApiService {

    public List<Movie> getMovieListActionGenre(String id);
}
