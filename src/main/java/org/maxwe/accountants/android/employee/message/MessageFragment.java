package org.maxwe.accountants.android.employee.message;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import org.maxwe.accountants.android.employee.R;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2015-11-23 23:25.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class MessageFragment extends Fragment implements AdapterView.OnItemClickListener {

    private static LinkedList<MessageEntity> messageEntities = new LinkedList<MessageEntity>();
    static {
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
        messageEntities.add(new MessageEntity("会计师资格考试报名","会计师资格报名从2015年12月25号上午8：00开始，截止2015年12月31号下午5：30。\n报名地址为http://developer.android.com/",12345,12345));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View messageView = inflater.inflate(R.layout.fragment_message, container, false);
        TextView titleName = (TextView) messageView.findViewById(R.id.title_name);
        titleName.setVisibility(View.VISIBLE);
        titleName.setText(R.string.string_tab_bar_message);
        ImageButton titleSearch = (ImageButton) messageView.findViewById(R.id.title_search);
        titleSearch.setVisibility(View.VISIBLE);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) titleSearch.getLayoutParams();
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        titleSearch.setLayoutParams(layoutParams);
        Bundle data = getArguments();
        Toast.makeText(getActivity(), data.getString("TEXT"), Toast.LENGTH_SHORT).show();

        ListView message_list_container = (ListView) messageView.findViewById(R.id.message_list_container);
        message_list_container.setAdapter(new MessageAdapter(this.getActivity(),messageEntities));
        message_list_container.setOnItemClickListener(this);
        return messageView;
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
