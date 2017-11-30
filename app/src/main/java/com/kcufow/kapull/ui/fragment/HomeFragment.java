package com.kcufow.kapull.ui.fragment;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.kcufow.kapull.MainActivity;
import com.kcufow.kapull.adapter.RoomAdapter;
import com.kcufow.kapull.ui.base.BaseFragment;
import com.kcufow.kapull.widget.GridSpacingItemDecoration;
import com.ldw.kapull.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.Locale;

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
        RoomAdapter roomAdapter = new RoomAdapter();
        rlRooms.setAdapter(roomAdapter);



    }

    @Override
    public void initData(Bundle savedInstanceState) {

        String s = String.format(Locale.CHINA, "第%02d条数据", 50);

        Log.i(TAG,"s ====="+s );
    }

    @Override
    public void setListener() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }


}
