package com.niit.recommended.repository;

import com.niit.recommended.domain.Genre;
import com.niit.recommended.domain.Movie;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


@Repository
public class MovieRepository{

    private List<Movie> movieList = new ArrayList<>();

    private  List<Genre> genreList = new ArrayList<>();

    public List<Movie> getMovieList(Predicate<Movie> predicate)
    {


        return this.movieList.stream().filter(predicate).toList();


    }

    public  List<Genre> getGenreList()
    {
        return Collections.unmodifiableList(this.genreList);
    }

    public boolean clearMovieList(){

        this.movieList.clear();

        return true;
    }

    public boolean populateMovieList(List<Movie> movies)
    {
           this.movieList.addAll(movies);

           return true;
    }

    public  boolean populateGenreList(List<Genre> genres)
    {
        this.genreList.addAll(genres);
        return true;
    }

//    public  int getMoviesByGenreId()
//    {
//        int ids[] = movieList.stream().filter(i -> movieList.get(i.getGenreList()
//    }
}
