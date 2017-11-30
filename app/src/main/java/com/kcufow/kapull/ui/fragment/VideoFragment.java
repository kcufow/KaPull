package com.kcufow.kapull.ui.fragment;

import android.os.Bundle;

import com.kcufow.kapull.ui.base.BaseFragment;
import com.ldw.kapull.R;

/**
 * Created by ldw on 2017/11/16.
 */

public class VideoFragment extends BaseFragment {
    @Override
    public void initView() {

    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    public void setListener() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_video;
    }

    public static VideoFragment newInstance(){
        VideoFragment fragment = new VideoFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
}
