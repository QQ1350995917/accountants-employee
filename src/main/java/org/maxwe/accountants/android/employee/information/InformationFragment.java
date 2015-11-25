package org.maxwe.accountants.android.employee.information;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.maxwe.accountants.android.employee.R;

/**
 * Created by Pengwei Ding on 2015-11-23 23:25.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: 我的信息
 */
public class InformationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View informationView = inflater.inflate(R.layout.fragment_information, container, false);
        TextView titleName = (TextView) informationView.findViewById(R.id.title_name);
        titleName.setVisibility(View.VISIBLE);
        titleName.setText(R.string.string_tab_bar_information);
        ImageButton settingSearch = (ImageButton) informationView.findViewById(R.id.title_setting);
        settingSearch.setVisibility(View.VISIBLE);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) settingSearch.getLayoutParams();
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        settingSearch.setLayoutParams(layoutParams);
        return informationView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("WORKAROUND_FOR_BUG_19917_KEY",  "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(outState);
    }
}
