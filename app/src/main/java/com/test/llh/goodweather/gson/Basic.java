package com.test.llh.goodweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by llh on 2017/10/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
