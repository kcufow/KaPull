package com.kcufow.kapull.manager;

import com.kcufow.kapull.bean.panda.DataInfoList.DataBean.ItemsBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ldw on 2017/12/2.
 */

public class PlayListManager {
    private static PlayListManager playListManager;
    private List<ItemsBean> itemsBeens;

    private PlayListManager(){
        itemsBeens = new ArrayList<>();
    }
    public static PlayListManager getInstance(){
        if (playListManager==null){
            synchronized (PlayListManager.class){
                if (playListManager == null) {
                    playListManager=new PlayListManager();
                }
            }
        }
        return playListManager;
    }
    public void addItemsBean(ItemsBean itemsBean){
        itemsBeens.clear();
        itemsBeens.add(itemsBean);
    }
    public void clear(){
        itemsBeens.clear();
    }
    public void destroy(){
        clear();
        itemsBeens=null;
        playListManager =null;
    }

    public ItemsBean getItemBean() {

        return itemsBeens.get(0);
    }
}
