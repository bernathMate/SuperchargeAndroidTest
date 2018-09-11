package com.example.bernathmate.superchargeandroidtest.service;

import com.example.bernathmate.superchargeandroidtest.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface TheMovieDBService {

    @GET("movie/{movie_id}")
    Call<Movie> getMovieById(@Header("Authorization") String authentication, @Path("movie_id") String movieId);

    @GET("search/movie")
    Call<List<Movie>> getMovies(@Header("Authorization") String authentication);
}
