package com.niit.recommended.service;

import com.niit.recommended.domain.Genre;
import com.niit.recommended.domain.Movie;
import com.niit.recommended.repository.MovieRecommendedRepository;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;


@Service
public class RecommendedForUserImpl implements RecommendedForUser{



    private MovieRecommendedRepository movieRepository;

    public RecommendedForUserImpl(MovieRecommendedRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public List<Movie> getRecommendedList() {


           List<Movie> movies = movieRepository.getMovieList();

           List<Movie> newMovies = movies.stream().limit(10).toList();

        return newMovies;
    }

    @Override
    public List<Genre> getGenreList() {

        List<Genre> genres = movieRepository.getGenreList();
        List<Genre> genreList = genres.stream().limit(10).toList();
        return genreList;
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

    public List<Movie> searchMovieListByMovieName(String movieName)
    {
        String url1 = "https://api.themoviedb.org/3/search/movie?api_key=dd4d819639705d332d531217b4f7c6b6&query="+movieName;

        System.out.println(url1);
        RestTemplate restTemplate = new RestTemplate();
        JSONObject result = restTemplate.getForObject(url1, JSONObject.class);

        System.out.println(result.get("results"));
       List<Movie> movie = ((List<Object>)result.get("results"))
                .stream()
                .map(i -> (LinkedHashMap)i)
                .map(i -> new Movie(i.get("original_title").toString()
                        ,i.get("overview").toString()
                        ,i.get("poster_path").toString()
                        ,i.get("vote_average").toString()
                        ,i.get("release_date").toString()))
                .toList();


        return movie;
    }



}
