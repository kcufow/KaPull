package com.kcufow.kapull.net;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.builder.GetBuilder;
import com.zhy.http.okhttp.builder.PostFormBuilder;
import com.zhy.http.okhttp.callback.Callback;

import java.util.Map;

/**
 * Created by ldw on 2017/11/30.
 */

public class NetManager {
    private NetManager(){

    }


    public static void get(String url, Map<String ,String> params, Callback callback){

        GetBuilder builder = OkHttpUtils.get().url(url);
        if (params != null &&params.size()>0) {
            for (String s :params.keySet()){
                builder.addParams(s,params.get(s));
            }
        }
        builder.build().execute(callback);


    }

    public static void post(String url, Map<String ,String> params, Callback callback){
        PostFormBuilder builder = OkHttpUtils.post().url(url);
        if (params != null &&params.size()>0) {
            for (String s :params.keySet()){
                builder.addParams(s,params.get(s));
            }
        }
        builder.build().execute(callback);
    }
}
