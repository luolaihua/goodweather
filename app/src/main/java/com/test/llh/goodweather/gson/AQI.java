package com.test.llh.goodweather.gson;

/**
 * Created by llh on 2017/10/1.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
