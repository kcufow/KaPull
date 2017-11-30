package com.kcufow.kapull.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kcufow.kapull.bean.panda.DataInfoList.DataBean.ItemsBean;
import com.ldw.kapull.R;

import java.util.List;

/**
 * Created by ldw on 2017/11/30.
 */
public class RoomAdapter extends RecyclerView.Adapter{


    private Context mContext;
    private List<ItemsBean> items;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext != null) {
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_rl_room, parent, false);
        RoomViewHolder holder = new RoomViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RoomViewHolder roomViewHolder = (RoomViewHolder) holder;
//        items.get(position).

    }

    @Override
    public int getItemCount() {
        return items==null?0:items.size();
    }
    public void setData(List<ItemsBean> items){
        this.items = items;
        notifyDataSetChanged();

    }

    class RoomViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public TextView tvCount;
        public ImageView ivIcon;
        public RoomViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvCount = (TextView) itemView.findViewById(R.id.tv_playcount);
            ivIcon = (ImageView) itemView.findViewById(R.id.iv_img);
        }
    }
}
