package com.niit.recommended.controller;

import com.niit.recommended.domain.Cast;
import com.niit.recommended.domain.Movie;
import com.niit.recommended.service.ThirdPartyApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v2/")
public class ThirdPartyApiController {

      private ThirdPartyApiService thirdPartyApiService;

      public  ThirdPartyApiController ( ThirdPartyApiService thirdPartyApiService)
      {
          this.thirdPartyApiService = thirdPartyApiService;
      }

    @GetMapping(value = "/thirdParty/{name}")
    public List<Cast> getCastForMovies(@PathVariable String name)
    {
        List<Cast> castsLists = thirdPartyApiService.getCastForMovies(name);
        return castsLists;
    }

    @GetMapping(value = "/thirdParty/Action")
    public List<Movie> getMovieListActionGenre()
    {
        List<Movie> actionMovieList = thirdPartyApiService.getMovieListActionGenre();
        return actionMovieList;
    }


    @GetMapping(value = "/thirdParty/Comedy")
    public List<Movie> getMovieListComedyGenre()
    {
        List<Movie> comedyMovieList = thirdPartyApiService.getMovieListComedyGenre();
        return comedyMovieList;
    }

    @GetMapping(value = "/thirdParty/Crime")
    public List<Movie> getMovieListCrimeGenre()
    {
          List<Movie> crimeMovieList = thirdPartyApiService.getMovieListCrimeGenre();
          return crimeMovieList;
    }


    @GetMapping(value = "/thirdParty/Family")
    public List<Movie> getMovieListFamilyGenre()
    {
        List<Movie> familyMovieList = thirdPartyApiService.getMovieListFamilyGenre();
        return familyMovieList;
    }

}
