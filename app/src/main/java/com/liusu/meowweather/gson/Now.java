package com.liusu.meowweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liusu on 18-2-6.
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
