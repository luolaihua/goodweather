package com.test.llh.goodweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by llh on 2017/10/1.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
