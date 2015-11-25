package org.maxwe.accountants.android.employee.information;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import org.maxwe.accountants.android.employee.R;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2015-11-25 13:08.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class InformationAdapter extends BaseAdapter {
    private Context context;
    private LinkedList<InformationEntity> informationEntities;
    private LayoutInflater inflater;

    public InformationAdapter(Context context, LinkedList<InformationEntity> informationEntities) {
        this.context = context;
        this.informationEntities = informationEntities;
        this.inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return this.informationEntities.size();
    }

    @Override
    public Object getItem(int position) {
        return this.informationEntities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView == null){
            view = this.inflater.inflate(R.layout.fragment_information_item,null);
        }else{
            view = convertView;
        }

        InformationEntity informationEntity = this.informationEntities.get(position);

        ImageView icon = (ImageView) view.findViewById(R.id.information_item_icon);
        TextView title = (TextView) view.findViewById(R.id.information_item_title);

        icon.setImageResource(informationEntity.getIcon());
        title.setText(informationEntity.getTitle());
        return view;
    }
}
