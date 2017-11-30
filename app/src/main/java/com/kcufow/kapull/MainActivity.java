package com.kcufow.kapull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kcufow.kapull.ui.activity.PureActivity;
import com.kcufow.kapull.ui.fragment.HomeFragment;
import com.ldw.kapull.R;

public class MainActivity extends PureActivity {



    @Override
    public int getRootViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initUI() {
    replaceFragment(HomeFragment.newInstance());

    }


}
