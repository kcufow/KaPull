package com.kcufow.kapull.ui.fragment;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kcufow.kapull.Constant;
import com.kcufow.kapull.bean.panda. DataInfoList.DataBean.ItemsBean ;
import com.kcufow.kapull.bean.panda.RoomInfo;
import com.kcufow.kapull.manager.PlayListManager;
import com.kcufow.kapull.net.Net;
import com.kcufow.kapull.net.NetManager;
import com.kcufow.kapull.net.callback.RoomInfoCallback;
import com.kcufow.kapull.ui.base.BaseFragment;
import com.kcufow.kapull.util.DensityUtil;
import com.kcufow.kapull.util.LogUtil;
import com.kcufow.kapull.util.T;
import com.ldw.kapull.R;
import com.pili.pldroid.player.PLMediaPlayer;
import com.pili.pldroid.player.widget.PLVideoTextureView;

import okhttp3.Call;


/**
 * Created by ldw on 2017/11/14.
 */

public class RoomFragment extends BaseFragment implements View.OnClickListener {

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
    private PlayListManager manager;
    private int currentOrientation =Configuration.ORIENTATION_PORTRAIT;

    public static RoomFragment newInstance(){
        RoomFragment fragment = new RoomFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    public boolean isLandscape() {
        return currentOrientation == Configuration.ORIENTATION_LANDSCAPE;
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
        currentOrientation = newConfig.orientation;

        showControlView();
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
        manager = PlayListManager.getInstance();
        ItemsBean itemBean = manager.getItemBean();
        String roomId =  itemBean.getId();
        clearData();
        initParams();

        getDataFromServer(roomId);


    }
    protected void initParams() {
       params.put(Net.ROOMID,"");
       params.put(Net.SLAVEFLAG,Constant.SLAVEFLAG);
       params.put(Net.TYPE,Constant.TYPE);
        super.initParams();
    }
    @Override
    public void initView() {
        ivBack = findView(R.id.ivBack);
        ivFullScreen = findView(R.id.ivFullScreen);
        plVideoView = findView(R.id.pl_video_view);
        tvRoomTitle = findView(R.id.tvRoomTitle);
        pbLoading = findView(R.id.pb_loading);
         videoContent = findView(R.id.videoContent);
         rlRoomInfo = findView(R.id.rlRoomInfo);
        ivBack.setOnClickListener(this);
        ivFullScreen.setOnClickListener(this);
        videoContent.setOnClickListener(this);

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
    public void onDestroy() {
        super.onDestroy();
        handler.removeMessages(EVENT_SHOW_CONTROLER);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.videoContent:
                clickFrameVideo();
                break;
            case R.id.ivBack:

                LogUtil.i(TAG,"back :---------");
                clickBack();
                break;
            case R.id.ivFullScreen:
                clickFullScreen();
                break;

        }
    }

    public void getDataFromServer(String roomId) {
        params.put(Net.ROOMID,roomId);

        NetManager.get(Net.BASEPLAYURL, params, new RoomInfoCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                T.showShort(mContext,"获取数据失败");
            }

            @Override
            public void onResponse(RoomInfo response, int id) {
                if (response == null) {

                    T.showShort(mContext,"数据为空");
                    return;
                }
                if (response.getErrno()!=0){
                    T.showShort(mContext,"服务器数据为空");
                    return;
                }
                String[] pl = response.getData().getInfo().getVideoinfo().getPlflag().split("_");
                String path = "http://pl" + pl[(pl.length - 1)] + ".live.panda.tv/live_panda/"
                        + response.getData().getInfo().getVideoinfo().getRoom_key() + "_mid.flv?sign="
                        + response.getData().getInfo().getVideoinfo().getSign() +
                        "&time=" + response.getData().getInfo().getVideoinfo().getTs();
                plVideoView.setVideoPath(path);
                plVideoView.start();

            }
        });
    }
}
