package com.liusu.meowweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liusu on 18-2-6.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
