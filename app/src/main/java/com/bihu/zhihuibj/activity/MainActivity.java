package com.bihu.zhihuibj.activity;

import android.os.Bundle;
import android.view.Window;

import com.bihu.zhihuibj.R;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

/**
 * 主页面
 * 
 * @author Kevin
 * @date 2015-10-17
 */
public class MainActivity extends SlidingFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题,
		// 必须在setContentView之前调用
		setContentView(R.layout.activity_main);
		
		//Utils.doSomthing();
		//R.drawable.p_10
		setBehindContentView(R.layout.left_menu);
		SlidingMenu slidingMenu = getSlidingMenu();
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);//全屏触摸
		slidingMenu.setBehindOffset(400);//屏幕预留200像素宽度
	}
}
