package org.maxwe.accountants.android.employee.workspace;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import org.maxwe.accountants.android.employee.R;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2015-11-25 12:14.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class WorkspaceAdapter extends BaseAdapter {
    private Context context;
    private LinkedList<WorkspaceEntity> workspaceEntities;
    private LayoutInflater inflater;

    public WorkspaceAdapter(Context context, LinkedList<WorkspaceEntity> workspaceEntities) {
        this.context = context;
        this.workspaceEntities = workspaceEntities;
        this.inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return this.workspaceEntities.size();
    }

    @Override
    public Object getItem(int position) {
        return this.workspaceEntities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null){
            view = this.inflater.inflate(R.layout.fragment_workspace_item,null);
        }else{
            view = convertView;
        }
        TextView title = (TextView) view.findViewById(R.id.workspace_item_title);
        TextView content = (TextView) view.findViewById(R.id.workspace_item_content);
        TextView timer = (TextView) view.findViewById(R.id.workspace_item_timer);
        WorkspaceEntity workspaceEntity = this.workspaceEntities.get(position);
        title.setText(workspaceEntity.getTitle());
        content.setText(workspaceEntity.getContent());
        timer.setText(workspaceEntity.getTimer());
        return view;
    }
}
