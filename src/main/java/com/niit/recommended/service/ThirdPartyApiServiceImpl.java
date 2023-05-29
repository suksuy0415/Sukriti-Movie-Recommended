package com.niit.recommended.service;

import com.niit.recommended.domain.Cast;
import com.niit.recommended.domain.Movie;
import com.niit.recommended.repository.MovieRecommendedRepository;
import com.niit.recommended.repository.ThirdPartyApiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ThirdPartyApiServiceImpl {

    private ThirdPartyApiRepository thirdPartyApiRepository;

    public ThirdPartyApiServiceImpl(ThirdPartyApiRepository thirdPartyApiRepository) {
        this.thirdPartyApiRepository = thirdPartyApiRepository;
    }



    public List<Cast> getCastForMovies(String name){

            List<Movie> movies = thirdPartyApiRepository.searchMovieListByMovieName(name);
            String id = thirdPartyApiRepository.getMovieIdByMovieName(name , movies);
            List<Cast> casts = thirdPartyApiRepository.getMovieCredits(id);

            return casts;

    }


    public List<Movie> getMovieListActionGenre()
    {
        String actionId = "28";
        List<Movie> movies = thirdPartyApiRepository.movieListforDifferentGenre(actionId); return movies;
    }
    public List<Movie> getMovieListComedyGenre()
    {
        String comedyId = "35";
        List<Movie> movies = thirdPartyApiRepository.movieListforDifferentGenre(comedyId); return movies;
    }
    public List<Movie> getMovieListCrimeGenre()
    {
        String crimeId = "80";
        List<Movie> movies = thirdPartyApiRepository.movieListforDifferentGenre(crimeId); return movies;
    }

    public List<Movie> getMovieListFamilyGenre()
    {
        String familyId = "10751";
        List<Movie> movies = thirdPartyApiRepository.movieListforDifferentGenre(familyId); return  movies;
    }


}