package org.maxwe.accountants.android.employee.settings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.maxwe.accountants.android.employee.R;

/**
 * Created by dingpw on 11/28/15.
 */
public class ModifyPasswordFragment extends Fragment implements View.OnClickListener{
    public static final String TAG = "ModifyPasswordFragment";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View modifyPasswordView = inflater.inflate(R.layout.fragment_modify_passwrod, container, false);
        ImageView backView = (ImageView) modifyPasswordView.findViewById(R.id.title_back);
        backView.setVisibility(View.VISIBLE);
        backView.setOnClickListener(this);
        return modifyPasswordView;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (R.id.title_back == id){

        }
    }


}
