package org.maxwe.accountants.android.employee.workspace;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import org.maxwe.accountants.android.employee.R;

/**
 * Created by Pengwei Ding on 2015-11-23 23:26.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class WorkspaceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View messageView = inflater.inflate(R.layout.fragment_workspace, container, false);
        TextView titleName = (TextView) messageView.findViewById(R.id.title_name);
        titleName.setVisibility(View.VISIBLE);
        titleName.setText(R.string.string_tab_bar_workspace);
        ImageButton titleSearch = (ImageButton) messageView.findViewById(R.id.title_search);
        titleSearch.setVisibility(View.VISIBLE);
        ImageButton titleMenu = (ImageButton) messageView.findViewById(R.id.title_menu);
        titleMenu.setVisibility(View.VISIBLE);
        return messageView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("WORKAROUND_FOR_BUG_19917_KEY",  "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(outState);
    }
}
