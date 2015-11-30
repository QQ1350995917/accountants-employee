package org.maxwe.accountants.android.employee.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.maxwe.accountants.android.employee.BaseActivity;
import org.maxwe.accountants.android.employee.R;

/**
 * Created by Pengwei Ding on 2015-11-25 14:23.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class SettingsActivity extends BaseActivity implements View.OnClickListener {

    private FrameLayout settings_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_settings);
        this.settings_container = (FrameLayout) this.findViewById(R.id.settings_container);
        ImageView backView = (ImageView) this.findViewById(R.id.title_back);
        backView.setVisibility(View.VISIBLE);
        backView.setOnClickListener(this);

        FragmentManager fragmentManager = this.getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.settings_container,new ItemListFragment(), ItemListFragment.TAG).commit();

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (R.id.title_back == id) {
            this.finish();
        }
//        RelativeLayout item = (RelativeLayout) v;
//        TextView childAt = (TextView) item.getChildAt(0);
//        float textSize = childAt.getTextSize();
//        Toast.makeText(this,"" + textSize,Toast.LENGTH_SHORT).show();
    }
}
