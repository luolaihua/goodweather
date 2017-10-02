package com.test.llh.goodweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by llh on 2017/10/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
