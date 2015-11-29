package org.maxwe.accountants.android.employee.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.maxwe.accountants.android.employee.BaseActivity;
import org.maxwe.accountants.android.employee.R;
import org.maxwe.accountants.android.employee.access.AccessActivity;

/**
 * Created by Pengwei Ding on 2015-11-25 14:23.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class SettingsActivity extends BaseActivity implements View.OnClickListener {

    private LinearLayout settings_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_settings);

        this.settings_container = (LinearLayout) this.findViewById(R.id.settings_container);

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
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (R.id.title_back == id) {
            this.finish();
        } else if (R.id.settings_item_password_modify == id) {
            this.settings_container.removeAllViews();
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.settings_container,new ModifyPasswordFragment(), ModifyPasswordFragment.TAG).commit();
        } else if (R.id.settings_item_logout == id) {
            Intent intent = new Intent(this, AccessActivity.class);
            this.startActivity(intent);
            this.finish();
        }
//        RelativeLayout item = (RelativeLayout) v;
//        TextView childAt = (TextView) item.getChildAt(0);
//        float textSize = childAt.getTextSize();
//        Toast.makeText(this,"" + textSize,Toast.LENGTH_SHORT).show();
    }
}
