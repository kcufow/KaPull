package com.kcufow.kapull.net.callback;

import com.google.gson.Gson;
import com.kcufow.kapull.bean.panda.RoomInfo;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Response;

/**
 * Created by ldw on 2017/12/2.
 */

public abstract class RoomInfoCallback extends Callback<RoomInfo> {
    @Override
    public RoomInfo parseNetworkResponse(Response response, int id) throws Exception {
        String s = response.body().string();
        Gson gson = new Gson();

        return gson.fromJson(s,RoomInfo.class);
    }
}
