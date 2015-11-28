package org.maxwe.accountants.android.employee.mainboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import org.maxwe.accountants.android.employee.BaseActivity;
import org.maxwe.accountants.android.employee.R;
import org.maxwe.accountants.android.employee.information.InformationFragment;
import org.maxwe.accountants.android.employee.message.MessageFragment;
import org.maxwe.accountants.android.employee.workspace.WorkspaceFragment;

import java.util.LinkedList;

/**
 * Created by Pengwei Ding on 2015-11-23 22:01.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: @TODO
 */
public class MainBoardActivity extends BaseActivity implements ViewPager.OnPageChangeListener, CompoundButton.OnCheckedChangeListener {

    private ViewPager act_main_container;
    private RadioGroup act_main_tab_container;
    private LinkedList<Fragment> fragments = new LinkedList<Fragment>();
    private MainBoardAdapter mainBoardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.initFragment();
        this.act_main_container = (ViewPager) this.findViewById(R.id.act_main_container);
        this.act_main_tab_container = (RadioGroup) this.findViewById(R.id.act_main_tab_container);
        for (int index = 0;index < this.act_main_tab_container.getChildCount();index++){
            ((RadioButton)this.act_main_tab_container.getChildAt(index)).setOnCheckedChangeListener(this);
        }
        this.mainBoardAdapter = new MainBoardAdapter(this.getSupportFragmentManager(), this.fragments);
        this.act_main_container.setAdapter(this.mainBoardAdapter);
        this.act_main_container.setOnPageChangeListener(this);
        this.act_main_container.setCurrentItem(1);
    }

    private void initFragment() {
        MessageFragment messageFragment = new MessageFragment();
        WorkspaceFragment workspaceFragment = new WorkspaceFragment();
        InformationFragment informationFragment = new InformationFragment();

        Bundle data = new Bundle();
        data.putString("TEXT", "hello world");
        messageFragment.setArguments(data);
        workspaceFragment.setArguments(data);
        informationFragment.setArguments(data);

        this.fragments.add(messageFragment);
        this.fragments.add(workspaceFragment);
        this.fragments.add(informationFragment);
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        RadioButton childAt = (RadioButton) this.act_main_tab_container.getChildAt(position);
        childAt.setChecked(true);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked){
            int id = buttonView.getId();
            if (R.id.act_main_tab_bar_message == id){
                this.act_main_container.setCurrentItem(0);
            } else if (R.id.act_main_tab_bar_workspace == id){
                this.act_main_container.setCurrentItem(1);
            }else if (R.id.act_main_tab_bar_information == id){
                this.act_main_container.setCurrentItem(2  );
            }
        }
    }
}
