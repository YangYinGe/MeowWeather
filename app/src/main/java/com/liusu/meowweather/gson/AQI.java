package com.liusu.meowweather.gson;

/**
 * Created by liusu on 18-2-6.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
