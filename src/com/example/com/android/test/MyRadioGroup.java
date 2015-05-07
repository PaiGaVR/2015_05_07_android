package com.example.com.android.test;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;

public class MyRadioGroup extends RadioGroup {
	private CheckListener checkListener;

	public MyRadioGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
		checkListener = new CheckListener();
		this.setOnCheckedChangeListener(checkListener);
	}
	
public class CheckListener implements OnCheckedChangeListener{
    	
		@Override
		public void onCheckedChanged(RadioGroup arg0, int arg1) {
			switch(arg1){
				case R.id.tab_icon_push_orders : {
					
					break;
				}
				case R.id.tab_icon_get_orders : {
					
					break;
				}
				case R.id.tab_icon_read_orders : {
					
					break;
				}
				case R.id.tab_icon_setting : {
					
					break;
				}
			}
		}
    }
}
