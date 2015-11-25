package org.maxwe.accountants.android.employee.workspace;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import org.maxwe.accountants.android.employee.R;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2015-11-23 23:26.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class WorkspaceFragment extends Fragment implements AdapterView.OnItemClickListener{
    private static LinkedList<WorkspaceEntity> workspaceEntities = new LinkedList<WorkspaceEntity>();
    static{
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
        workspaceEntities.add(new WorkspaceEntity("小喇叭","欢迎来到注册会计师","星期一"));
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View workspaceView = inflater.inflate(R.layout.fragment_workspace, container, false);
        TextView titleName = (TextView) workspaceView.findViewById(R.id.title_name);
        titleName.setVisibility(View.VISIBLE);
        titleName.setText(R.string.string_tab_bar_workspace);
        ImageButton titleSearch = (ImageButton) workspaceView.findViewById(R.id.title_search);
        titleSearch.setVisibility(View.VISIBLE);
        ImageButton titleMenu = (ImageButton) workspaceView.findViewById(R.id.title_menu);
        titleMenu.setVisibility(View.VISIBLE);

        ListView workspace_list_container = (ListView) workspaceView.findViewById(R.id.workspace_list_container);
        workspace_list_container.setAdapter(new WorkspaceAdapter(this.getActivity(),workspaceEntities));
        workspace_list_container.setOnItemClickListener(this);
        return workspaceView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("WORKAROUND_FOR_BUG_19917_KEY",  "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this.getActivity(),"开发中请稍后",Toast.LENGTH_SHORT).show();
    }
}
