package org.maxwe.accountants.android.employee.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import org.maxwe.accountants.android.employee.BaseActivity;
import org.maxwe.accountants.android.employee.R;

/**
 * Created by Pengwei Ding on 2015-11-25 14:23.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class SettingsActivity extends BaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_settings);
        ImageView backView = (ImageView) this.findViewById(R.id.title_back);
        backView.setVisibility(View.VISIBLE);
        backView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        this.finish();
    }
}
