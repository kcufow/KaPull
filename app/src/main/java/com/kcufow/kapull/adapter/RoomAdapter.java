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
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ldw on 2017/11/30.
 */
public class RoomAdapter extends RecyclerView.Adapter{


    private Context mContext;
    private List<ItemsBean> items;
    private OnItemClickListener mItemClickListener;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext == null) {
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_rl_room, parent, false);
        RoomViewHolder holder = new RoomViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RoomViewHolder roomViewHolder = (RoomViewHolder) holder;
        ItemsBean itemsBean = items.get(position);
        roomViewHolder.tvName.setText(position+1+"、"+ itemsBean.getUserinfo().getNickName());
        roomViewHolder.tvCount.setText(itemsBean.getName());
        Picasso.with(mContext).load(itemsBean.getPictures().getImg())
                .placeholder(R.mipmap.tv_item_default)
                .into(roomViewHolder.ivIcon);
    }

    @Override
    public int getItemCount() {
        return items==null?0:items.size();
    }
    public void setData(List<ItemsBean> items){
        this.items = items;
        notifyDataSetChanged();

    }


    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        this.mItemClickListener = listener;
    }

    private class RoomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvName;
        TextView tvCount;
        ImageView ivIcon;
        RoomViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvCount = (TextView) itemView.findViewById(R.id.tv_playcount);
            ivIcon = (ImageView) itemView.findViewById(R.id.iv_img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mItemClickListener != null) {
                mItemClickListener.onItemClick(v,getAdapterPosition());
            }
        }
    }


}
