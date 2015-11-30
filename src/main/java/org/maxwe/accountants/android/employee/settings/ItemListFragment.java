package org.maxwe.accountants.android.employee.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import org.maxwe.accountants.android.employee.R;
import org.maxwe.accountants.android.employee.access.AccessActivity;

/**
 * Created by Pengwei Ding on 2015-11-30 17:21.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class ItemListFragment extends Fragment implements View.OnClickListener{
    public static final String TAG = "ItemListFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View settingsItemListView = inflater.inflate(R.layout.fragment_settings_items, container, false);
        LinearLayout settings_item_container = (LinearLayout) settingsItemListView.findViewById(R.id.settings_item_container);
        for (int index = 0; index < settings_item_container.getChildCount(); index++) {
            View item = settings_item_container.getChildAt(index);
            item.setClickable(true);
            item.setOnClickListener(this);
        }
        return settingsItemListView;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (R.id.settings_item_password_modify == id) {
//            this.settings_container.removeAllViews();
//            FragmentManager fragmentManager = this.getSupportFragmentManager();
//            fragmentManager.beginTransaction().add(R.id.settings_container,new ModifyPasswordFragment(), ModifyPasswordFragment.TAG).commit();
        } else if (R.id.settings_item_logout == id) {
            Intent intent = new Intent(this.getActivity(), AccessActivity.class);
            this.startActivity(intent);
            this.getActivity().finish();
        }
    }
}
