package com.kcufow.kapull.net.callback;

import com.google.gson.Gson;
import com.kcufow.kapull.bean.panda.DataInfoList;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Response;

/**
 * Created by ldw on 2017/11/30.
 */

public abstract class DataInfoListCallback extends Callback<DataInfoList> {

    @Override
    public DataInfoList parseNetworkResponse(Response response, int id) throws Exception {
        String s = response.body().string();
        Gson gson = new Gson();

        return gson.fromJson(s, DataInfoList.class);
    }
}
