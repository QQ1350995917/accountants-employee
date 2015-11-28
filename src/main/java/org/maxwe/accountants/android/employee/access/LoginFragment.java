package org.maxwe.accountants.android.employee.access;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import org.maxwe.accountants.android.employee.R;
import org.maxwe.accountants.android.employee.mainboard.MainBoardActivity;

/**
 * Created by Pengwei Ding on 2015-11-25 17:57.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class LoginFragment extends Fragment implements View.OnClickListener{
    public static final String TAG = "LoginFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View loginView = inflater.inflate(R.layout.fragment_login, container, false);
        Button login_sure = (Button)loginView.findViewById(R.id.login_sure);
        login_sure.setOnClickListener(this);
        return loginView;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (R.id.login_sure == id){
            Intent intent = new Intent(this.getActivity(),MainBoardActivity.class);
            this.getActivity().startActivity(intent);
            this.getActivity().finish();
        }
    }
}
