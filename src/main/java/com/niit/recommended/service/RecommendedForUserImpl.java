package com.niit.recommended.service;

import com.niit.recommended.domain.Genre;
import com.niit.recommended.domain.Movie;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;


@Service
public class RecommendedForUserImpl implements RecommendedForUser{




    @Override
    public List<Movie> getRecommendedList() {




        return null;
    }

    @Override
    public List<Movie> getRecommendedList(String name) {
        return null;
    }

    @Override
    public List<Movie> getMovieListByGenre(String name , List<Genre> genres) {

        String uri = "https://api.themoviedb.org/3/movie/popular?api_key=dd4d819639705d332d531217b4f7c6b6&page=1&language=en-US&region=US";
        RestTemplate restTemplate = new RestTemplate();
        JSONObject result = restTemplate.getForObject(uri, JSONObject.class);

        List<Movie> movie = ((List<Object>)result.get("results"))
                .stream()
                .map(i -> (LinkedHashMap)i)
                .map(i -> new Movie(i.get("backdrop_path").toString()
                        , (List<Genre>) i.get("genre_ids")
                        , Integer.parseInt(i.get("id").toString())
                        ,i.get("original_title").toString()
                        ,i.get("overview").toString()
                        ,i.get("poster_path").toString()
                        ,Float.parseFloat(i.get("vote_average").toString())))
                .toList();

        for(int i = 0 ; i<genres.size() ; i++)
        {
            if(name.equals(genres.get(i).getName()))
            {
                int id = genres.get(i).getId();

                for(int j=0 ; j<movie.size() ; i++)
                {
                    for(j=0 ; j< movie.get(j).getGenreList().size(); j++)
                    {
                        if(id == movie.get(j).getGenreList().get(j).getId())
                        {
                            String title=movie.get(j).getOriginal_title();
                            String overview=movie.get(j).getOverview();


                        }
                    }
                }
            }


        }




        return null;
    }

    @Override
    public List<Movie> getMovieListByName(String original_title) {
        return null;
    }
}
