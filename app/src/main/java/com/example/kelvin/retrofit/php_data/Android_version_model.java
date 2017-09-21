package com.example.kelvin.retrofit.php_data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kelvin on 9/18/2017.
 */

public class Android_version_model {

    @SerializedName("version_name")
    public String versionname;

    @SerializedName("api_level")
    public String api;

    @SerializedName("image_path")
    public String img_path;

    public String getVersionName() {
        return versionname;
    }

    public String getApi() {
        return api;
    }

    public String getImg_path() {
        return img_path;
    }
}
