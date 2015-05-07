package com.example.com.android.test;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.RadioGroup.OnCheckedChangeListener;

@SuppressWarnings("deprecation")
public class InitActivity extends TabActivity {
	private TabHost tab_host;
	private RadioGroup main_radio_group;
	private RadioButton push_orders_button, get_orders_button, read_orders_button, setting_button;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        
        // 获取按钮
        //main_radio_group = (RadioGroup)findViewById(R.id.main_radiogroup);
        
        push_orders_button = (RadioButton)findViewById(R.id.tab_icon_push_orders);
        get_orders_button = (RadioButton)findViewById(R.id.tab_icon_get_orders);
        read_orders_button = (RadioButton)findViewById(R.id.tab_icon_read_orders);
        setting_button = (RadioButton)findViewById(R.id.tab_icon_setting);
        
        // 添加tab
        tab_host = getTabHost();
        tab_host.addTab(tab_host.newTabSpec("tag1").setIndicator("0").setContent(new Intent(this, PushOrdersActivity.class)));
        tab_host.addTab(tab_host.newTabSpec("tag2").setIndicator("1").setContent(new Intent(this, GetOrdersActivity.class)));
        tab_host.addTab(tab_host.newTabSpec("tag3").setIndicator("2").setContent(new Intent(this, ReadOrdersActivity.class)));
        tab_host.addTab(tab_host.newTabSpec("tag4").setIndicator("3").setContent(new Intent(this, SettingActivity.class)));
        
        CheckListener checkListener = new CheckListener();
        main_radio_group.setOnCheckedChangeListener(checkListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public class CheckListener implements OnCheckedChangeListener{
    	
		@Override
		public void onCheckedChanged(RadioGroup arg0, int arg1) {
			switch(arg1){
				case R.id.tab_icon_push_orders : {
					tab_host.setCurrentTab(0);
					break;
				}
				case R.id.tab_icon_get_orders : {
					tab_host.setCurrentTab(1);
					break;
				}
				case R.id.tab_icon_read_orders : {
					tab_host.setCurrentTab(2);
					break;
				}
				case R.id.tab_icon_setting : {
					tab_host.setCurrentTab(3);
					break;
				}
			}
		}
    }
}
