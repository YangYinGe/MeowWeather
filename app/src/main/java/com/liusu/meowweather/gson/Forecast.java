package com.liusu.meowweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liusu on 18-2-6.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperaturel;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
