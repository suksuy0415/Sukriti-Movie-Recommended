package com.niit.recommended.domain;

import java.util.List;

public class Movie {


    private String backdrop_path;
    private List<Genre> genreList;

    //private String genreId;
    private int  id;
    private String original_title;
    private String overview;

    private String poster_path;
    private float vote_average;


   // private List<Movie> movieList;



    public Movie(){}

    public Movie(String backdrop_path, List<Genre> genreList, int id, String original_title, String overview, String poster_path, float vote_average) {
        this.backdrop_path = backdrop_path;
        this.genreList = genreList;
        this.id = id;
        this.original_title = original_title;
        this.overview = overview;
        this.poster_path = poster_path;
        this.vote_average = vote_average;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "backdrop_path='" + backdrop_path + '\'' +
                ", genreList=" + genreList +
                ", id=" + id +
                ", original_title='" + original_title + '\'' +
                ", overview='" + overview + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", vote_average=" + vote_average +
                '}';
    }
}
