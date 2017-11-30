package com.kcufow.kapull.ui.fragment;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kcufow.kapull.ui.base.BaseFragment;
import com.kcufow.kapull.util.DensityUtil;
import com.kcufow.kapull.util.LogUtil;
import com.ldw.kapull.R;
import com.pili.pldroid.player.PLMediaPlayer;
import com.pili.pldroid.player.widget.PLVideoTextureView;




/**
 * Created by ldw on 2017/11/14.
 */

public class RoomFragment extends BaseFragment {

    private static final String TAG = "RoomFragment";
    private static final int EVENT_SHOW_CONTROLER = 0;


    ImageView ivBack;

    ImageView ivShare;

    TextView tvRoomTitle;

    ImageView ivFullScreen;

    RelativeLayout rlRoomInfo;

    RelativeLayout videoContent;

    PLVideoTextureView plVideoView;

    ProgressBar pbLoading;
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
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        handler.removeMessages(EVENT_SHOW_CONTROLER);
    }
}
