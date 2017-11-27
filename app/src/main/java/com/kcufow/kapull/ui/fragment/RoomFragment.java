package com.kcufow.kapull.ui.fragment;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
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
import com.kcufow.kapull.util.LogUtil;
import com.ldw.kapull.R;
import com.ldw.xbaselibrary.baseui.XBaseFragment;
import com.pili.pldroid.player.PLMediaPlayer;
import com.pili.pldroid.player.widget.PLVideoTextureView;
import com.pili.pldroid.player.widget.PLVideoView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by ldw on 2017/11/14.
 */

public class RoomFragment extends XBaseFragment {

    private static final String TAG = "RoomFragment";
    private static final int EVENT_SHOW_CONTROLER = 0;

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
    private String url;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

            switch (msg.what){
                case EVENT_SHOW_CONTROLER :

                    viewGone(rlRoomInfo);

                    break;
                default:
                    super.handleMessage(msg);
                break;
            }

        }
    };

    public static RoomFragment newInstance(String url){
        RoomFragment fragment = new RoomFragment();
        fragment.url = url;
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
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
    public void initData(Bundle savedInstanceState) {

        plVideoView.setVideoPath(url);
        plVideoView.start();


    }

    @Override
    public void initView() {
        //加载视频播放器
        plVideoView.setBufferingIndicator(pbLoading);

    }
    @Override
    public void setListener() {
        plVideoView.setOnErrorListener(new PLMediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(PLMediaPlayer plMediaPlayer, int i) {
                LogUtil.i(TAG,"onError :"+i);

                return false;
            }
        });
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_room;
    }


    @OnClick({ R.id.videoContent,R.id.ivBack, R.id.ivFullScreen})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.videoContent:
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
        int i = rlRoomInfo.getVisibility();
       switch (i){
           case View.VISIBLE:
               viewGone(rlRoomInfo);
//               viewVisible(rlRoomInfo);

               break;
           case View.INVISIBLE:
               break;
           case View.GONE:
               showControlView();
               break;
       }

    }

    private void showControlView() {
        rlRoomInfo.setVisibility(View.VISIBLE);
        Message msg = Message.obtain();
        msg.what = EVENT_SHOW_CONTROLER ;
        handler.sendMessageDelayed(msg,5000);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
