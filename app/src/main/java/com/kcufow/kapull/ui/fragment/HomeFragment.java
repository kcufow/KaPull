package com.kcufow.kapull.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kcufow.kapull.Constant;
import com.kcufow.kapull.bean.panda.DataInfoList;
import com.kcufow.kapull.manager.PlayListManager;
import com.kcufow.kapull.ui.activity.MainActivity;
import com.kcufow.kapull.adapter.RoomAdapter;
import com.kcufow.kapull.bean.panda.DataInfoList.DataBean.ItemsBean;
import com.kcufow.kapull.net.Net;
import com.kcufow.kapull.net.NetManager;
import com.kcufow.kapull.net.callback.DataInfoListCallback;
import com.kcufow.kapull.ui.activity.RoomActivity;
import com.kcufow.kapull.ui.base.BaseFragment;
import com.kcufow.kapull.util.T;
import com.kcufow.kapull.widget.GridSpacingItemDecoration;
import com.ldw.kapull.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import okhttp3.Call;

/**
 * Created by ldw on 2017/11/29.
 */

public class HomeFragment extends BaseFragment {
    private static final String TAG = "HomeFragment";
    private Toolbar toolbar;
    private TextView tbName;
    private MainActivity mActivity;
    private SmartRefreshLayout refreshLayout;
    private RecyclerView rlRooms;
    private ImageView ivLoading;

    private List<ItemsBean> itemsBeens;
    private boolean isLloadMore;
    private RoomAdapter roomAdapter;
    private PlayListManager manager;


    public static HomeFragment newInstance(){
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void initView() {
        toolbar = findView(R.id.toolbar);
        tbName = findView(R.id.toolbar_title);
        refreshLayout = findView(R.id.refreshLayout);
        rlRooms = findView(R.id.recycle_view);
        ivLoading = findView(R.id.iv_loading);
        mActivity = (MainActivity) getActivity();
        mActivity.setSupportActionBar(toolbar);
        tbName.setText(getString(R.string.title_fragment_name));
        ActionBar actionBar = mActivity.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }

        RecyclerView.LayoutManager layout = new GridLayoutManager(mContext,2);
        rlRooms.setLayoutManager(layout);
        rlRooms.addItemDecoration(new GridSpacingItemDecoration(2,getResources().getDimensionPixelSize(R.dimen.padding_middle),true));
        rlRooms.setHasFixedSize(true);
        roomAdapter = new RoomAdapter();
        rlRooms.setAdapter(roomAdapter);



    }

    @Override
    public void initData(Bundle savedInstanceState) {
        manager = PlayListManager.getInstance();
        clearData();
        initParams();

        itemsBeens = new ArrayList<>();
        getDataFromServer("1");
    }

    protected void initParams() {
        params.put(Net.CATE,Constant.CATE);
        params.put(Net.PAGENO,Constant.PAGENO);
        params.put(Net.PAGENUM,Constant.PAGENUM);
        params.put(Net.SPROOM,Constant.SPROOM);
       super.initParams();
    }
    private int pageCount = 1;

    @Override
    public void setListener() {

//        refreshLayout.setEnableAutoLoadmore(true);
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                isLloadMore =false;
               getDataFromServer("1");

            }
        });
        refreshLayout.setOnLoadmoreListener(new OnLoadmoreListener() {

            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                pageCount++;
                getDataFromServer(""+pageCount);
                isLloadMore =true;
            }
        });
        roomAdapter.setOnItemClickListener(new RoomAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                manager.addItemsBean(itemsBeens.get(position));
                startActivity(new Intent(mActivity, RoomActivity.class));

            }
        });

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }


    public void getDataFromServer(String pageno) {
        params.put(Net.PAGENO,pageno);

        NetManager.get(Net.BASEROOMURL,params,dataInfoListCallback);


    }

    private DataInfoListCallback dataInfoListCallback = new DataInfoListCallback() {
        @Override
        public void onError(Call call, Exception e, int id) {
            T.showShort(mContext,"数据获取失败");

        }

        @Override
        public void onResponse(DataInfoList response, int id) {
            if (response == null) {

                T.showShort(mContext,"数据获取失败");
                return;
            }
            if (response.getErrno()!=0){
                T.showShort(mContext,"数据获取失败");
                return;
            }
            List<ItemsBean> items = response.getData().getItems();

            if (isLloadMore){
                refreshLayout.finishLoadmore();
                if (items.size()==0) {

                    refreshLayout.setLoadmoreFinished(true);
                }else {

                    refreshLayout.setLoadmoreFinished(false);
                }

            }else {
                ivLoading.setVisibility(View.GONE);
                itemsBeens.clear();
                refreshLayout.finishRefresh();
                refreshLayout.setLoadmoreFinished(false);
            }
            itemsBeens.addAll(items);

            roomAdapter.setData(itemsBeens);




        }
    };
}
