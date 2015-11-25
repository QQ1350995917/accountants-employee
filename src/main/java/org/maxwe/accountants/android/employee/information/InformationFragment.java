package org.maxwe.accountants.android.employee.information;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import org.maxwe.accountants.android.employee.R;
import org.maxwe.accountants.android.employee.settings.SettingsActivity;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2015-11-23 23:25.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: 我的信息
 */
public class InformationFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    private static LinkedList<InformationEntity> informationEntities = new LinkedList<InformationEntity>();
    static {
        informationEntities.add(new InformationEntity("我的接单",R.drawable.temp_icon_my_order_helper,""));
        informationEntities.add(new InformationEntity("我的账户",R.drawable.temp_icon_my_account,""));
        informationEntities.add(new InformationEntity("我的订阅",R.drawable.temp_icon_my_subscribe,""));
        informationEntities.add(new InformationEntity("推荐",R.drawable.temp_icon_linkmate,""));
        informationEntities.add(new InformationEntity("邀请",R.drawable.temp_icon_my_invite,""));
        informationEntities.add(new InformationEntity("人脉",R.drawable.temp_icon_linkmate,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
        informationEntities.add(new InformationEntity("联系我们",R.drawable.temp_icon_my_contact_us,""));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View informationView = inflater.inflate(R.layout.fragment_information, container, false);
        TextView titleName = (TextView) informationView.findViewById(R.id.title_name);
        titleName.setVisibility(View.VISIBLE);
        titleName.setText(R.string.string_tab_bar_information);
        ImageButton setting = (ImageButton) informationView.findViewById(R.id.title_setting);
        setting.setVisibility(View.VISIBLE);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) setting.getLayoutParams();
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        setting.setLayoutParams(layoutParams);
        setting.setOnClickListener(this);

        GridView information_container = (GridView) informationView.findViewById(R.id.information_container);
        information_container.setAdapter(new InformationAdapter(this.getActivity(),informationEntities));
        information_container.setOnItemClickListener(this);
        return informationView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("WORKAROUND_FOR_BUG_19917_KEY",  "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {
        Intent settingIntent = new Intent(this.getActivity(),SettingsActivity.class);
        this.startActivity(settingIntent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this.getActivity(),"开发中请稍后",Toast.LENGTH_SHORT).show();
    }
}
