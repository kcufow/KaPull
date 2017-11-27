package com.kcufow.kapull.ui.fragment;

import android.os.Bundle;

import com.ldw.kapull.R;
import com.ldw.xbaselibrary.baseui.XBaseFragment;

/**
 * Created by ldw on 2017/11/16.
 */

public class VideoFragment extends XBaseFragment {
    @Override
    public void initView() {

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
