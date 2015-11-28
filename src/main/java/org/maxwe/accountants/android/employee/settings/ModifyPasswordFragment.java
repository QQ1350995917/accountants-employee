package org.maxwe.accountants.android.employee.settings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import org.maxwe.accountants.android.employee.R;

/**
 * Created by dingpw on 11/28/15.
 */
public class ModifyPasswordFragment extends Fragment {
    public static final String TAG = "ModifyPasswordFragment";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View loginView = inflater.inflate(R.layout.fragment_modify_passwrod, container, false);

        return loginView;
    }
}
