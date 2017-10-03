package com.test.llh.goodweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by llh on 2017/9/30.
 */

public class HttpUtill {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
