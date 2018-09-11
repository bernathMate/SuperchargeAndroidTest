package com.example.bernathmate.superchargeandroidtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.bernathmate.superchargeandroidtest.service.TheMovieDBService;
import com.example.bernathmate.superchargeandroidtest.service.TheMovieDBServiceImpl;

public class MainActivity extends AppCompatActivity {

    public static final String API_KEY = "43a7ea280d085bd0376e108680615c7f";

    public TheMovieDBService theMovieDBService = TheMovieDBServiceImpl.createImplementationToTMDBS();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
