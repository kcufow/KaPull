package com.kcufow.kapull.ui.fragment;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kcufow.kapull.util.DensityUtil;
import com.ldw.kapull.R;
import com.ldw.xbaselibrary.baseui.XBaseFragment;
import com.pili.pldroid.player.widget.PLVideoTextureView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by ldw on 2017/11/14.
 */

public class RoomFragment extends XBaseFragment {


    @BindView(R.id.frameVideo)
    FrameLayout frameVideo;
    @BindView(R.id.ivBack)
    ImageView ivBack;
    @BindView(R.id.ivShare)
    ImageView ivShare;
    @BindView(R.id.tvRoomTitle)
    TextView tvRoomTitle;
    @BindView(R.id.ivFullScreen)
    ImageView ivFullScreen;
    @BindView(R.id.rlRoomInfo)
    RelativeLayout rlRoomInfo;
    @BindView(R.id.videoContent)
    RelativeLayout videoContent;
    @BindView(R.id.pl_video_view)
    PLVideoTextureView plVideoView;
    @BindView(R.id.pb_loading)
    ProgressBar pbLoading;
    Unbinder unbinder;

    public boolean isLandscape() {
        return getActivity().getRequestedOrientation() == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
    }

    public void clickFullScreen() {
        if (isLandscape()) {
            getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }

    public void clickBack() {
        if (isLandscape()) {
            getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            mContext.finish();
        }
    }

    public void updateVideoLayoutParams() {
        ViewGroup.LayoutParams lp = videoContent.getLayoutParams();
        if (isLandscape()) {
            lp.height = DensityUtil.getDisplayMetrics(mContext).heightPixels;
        } else {
            lp.height = (int) (DensityUtil.getDisplayMetrics(mContext).widthPixels / 16.0f * 9.0f);
        }

        videoContent.setLayoutParams(lp);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        updateVideoLayoutParams();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void initView() {

    }

    @Override
    public void setListener() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_room;
    }


    @OnClick({R.id.frameVideo, R.id.ivBack, R.id.ivFullScreen})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.frameVideo:
                clickFrameVideo();
                break;
            case R.id.ivBack:
                clickBack();
                break;
            case R.id.ivFullScreen:
                clickFullScreen();
                break;

        }
    }

    private void clickFrameVideo() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
