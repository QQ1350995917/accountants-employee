package org.maxwe.accountants.android.employee.access;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import org.maxwe.accountants.android.employee.BaseActivity;
import org.maxwe.accountants.android.employee.R;

/**
 * Created by Pengwei Ding on 2015-11-25 17:54.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class AccessActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_access);
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        fragmentManager.beginTransaction().add(new LoginFragment(),null).commit();
    }
}
