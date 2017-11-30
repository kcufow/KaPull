package com.kcufow.kapull.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ldw on 2017/11/30.
 */
public abstract class BaseFragment extends Fragment{

    protected View rootView;
    protected LayoutInflater layoutInflater;
    protected AppCompatActivity mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContext = (AppCompatActivity) getActivity();
        layoutInflater = inflater;
        if (rootView == null) {
            rootView = inflater.inflate(getLayoutId(), null);
        } else {
            ViewGroup viewGroup = (ViewGroup) rootView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(rootView);
            }
        }


        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        setListener();
        initData(savedInstanceState);
    }

    public void viewGone(View view) {
        view.setVisibility(View.GONE);

    }

    public void viewInvisible(View view) {
        view.setVisibility(View.INVISIBLE);
    }

    public void viewVisible(View view) {
        view.setVisibility(View.VISIBLE);
    }
    public <V extends View> V findView(int viewId) {
        V view = (V)(rootView.findViewById(viewId));
        return view;
    }

    protected abstract void initView();

    protected abstract void initData(Bundle savedInstanceState);

    protected abstract void setListener();

    protected abstract int getLayoutId();

}
