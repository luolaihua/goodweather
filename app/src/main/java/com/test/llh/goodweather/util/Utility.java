package com.test.llh.goodweather.util;

import android.text.TextUtils;

import com.test.llh.goodweather.db.City;
import com.test.llh.goodweather.db.County;
import com.test.llh.goodweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by llh on 2017/9/30.
 */

public class Utility {
    /*
    * 解析和处理服务器返回的省级数据*/
    public static boolean handleProvinceResponce(String responce) {
        if (!TextUtils.isEmpty(responce)) {
            try{
                JSONArray allProvinces = new JSONArray(responce);
                for (int i= 0;i<allProvinces.length();i++) {
                    JSONObject provinceProject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceProject.getString("name"));
                    province.setProvinceCode(provinceProject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /*
    * 解析和处理服务器返回的市级数据*/
    public static boolean handleCityResponce(String responce,int provinceId) {
        if (!TextUtils.isEmpty(responce)) {
            try{
                JSONArray allCities = new JSONArray(responce);
                for (int i= 0;i<allCities.length();i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /*
    * 解析和处理服务器的县级数据
    * */
    public static boolean handleCountyResponce(String responce,int cityId) {
        if (!TextUtils.isEmpty(responce)) {
            try{
                JSONArray allCounties = new JSONArray(responce);
                for (int i= 0;i<allCounties.length();i++) {
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
