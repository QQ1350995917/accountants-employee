package org.maxwe.accountants.android.employee.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import org.maxwe.accountants.android.employee.BaseActivity;
import org.maxwe.accountants.android.employee.R;

/**
 * Created by Pengwei Ding on 2015-11-25 14:23.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class SettingsActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_settings);
        ImageView backView = (ImageView) this.findViewById(R.id.title_back);
        backView.setVisibility(View.VISIBLE);
        backView.setOnClickListener(this);

        LinearLayout settings_item_container = (LinearLayout) this.findViewById(R.id.settings_item_container);
        for (int index = 0; index < settings_item_container.getChildCount(); index++) {
            View item = settings_item_container.getChildAt(index);
            item.setClickable(true);
            item.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        RelativeLayout item = (RelativeLayout) v;
        TextView childAt = (TextView) item.getChildAt(0);
        float textSize = childAt.getTextSize();
        Toast.makeText(this,"" + textSize,Toast.LENGTH_SHORT).show();
    }
}
