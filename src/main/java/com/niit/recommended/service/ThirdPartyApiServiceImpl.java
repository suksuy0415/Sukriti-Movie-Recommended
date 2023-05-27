package com.niit.recommended.service;

import com.niit.recommended.domain.Movie;
import com.niit.recommended.repository.MovieRecommendedRepository;
import com.niit.recommended.repository.ThirdPartyApiRepository;

import java.util.List;

public class ThirdPartyApiServiceImpl {

    private ThirdPartyApiRepository thirdPartyApiRepository;

    public ThirdPartyApiServiceImpl(ThirdPartyApiRepository thirdPartyApiRepository) {
        this.thirdPartyApiRepository = thirdPartyApiRepository;
    }


    public List<Movie> getMovieListActionGenre(String id)
    {
        String actionId = "28";
        List<Movie> movies = thirdPartyApiRepository.movieListforDifferentGenre(actionId); return movies;
    }

}

