package org.maxwe.accountants.android.employee.message;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import org.maxwe.accountants.android.employee.R;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2015-11-25 11:12.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class MessageAdapter extends BaseAdapter {
    private Context content;
    private LinkedList<MessageEntity> messageEntities;
    private LayoutInflater inflater;

    public MessageAdapter(Context context, LinkedList<MessageEntity> messageEntities) {
        this.content = context;
        this.messageEntities = messageEntities;
        this.inflater = LayoutInflater.from(this.content);
    }

    @Override
    public int getCount() {
        return this.messageEntities.size();
    }

    @Override
    public Object getItem(int position) {
        return this.messageEntities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = this.inflater.inflate(R.layout.fragment_message_item, null);
        } else {
            view = convertView;
        }
        TextView title = (TextView) view.findViewById(R.id.message_item_title);
        TextView content = (TextView) view.findViewById(R.id.message_item_content);
        TextView explore = (TextView) view.findViewById(R.id.message_item_explore);
        TextView join = (TextView) view.findViewById(R.id.message_item_join);
        MessageEntity messageEntity = this.messageEntities.get(position);
        title.setText(messageEntity.getTitle());
        content.setText(messageEntity.getContent());
        explore.setText("已浏览："+messageEntity.getExplore());
        join.setText("已报名："+ messageEntity.getJoin());
        return view;
    }
}
