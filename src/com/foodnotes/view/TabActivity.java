package com.foodnotes.view;

import com.example.foodnotes.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TabActivity extends FragmentActivity {
	private FragmentTabHost mTabHost;
	private LayoutInflater mInflater;

	int[] drawables = { R.drawable.bg_highlights_selector,
			R.drawable.bg_found_selector, R.drawable.bg_publish_selector,
			R.drawable.bg_focus_selector, R.drawable.bg_personcenter_selector };

	Class<?>[] fragment = { HighLights.class, Found.class, Publish.class,
			Focus.class, PersonCenter.class };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		mInflater = getLayoutInflater();
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realcontainer);
		
		for (int i = 0; i < fragment.length; i++) {
			// System.out.println(mTabHost);
			// Ϊ�����������Ŀ,setIndicator()Ϊÿ����Ŀ������ݣ��磺ImageView��TextView��
			//
			mTabHost.addTab(this.mTabHost.newTabSpec(null)
					.setIndicator(getItemView(i)), this.fragment[i], null);
			// Ϊÿ����Ŀ��ӱ���ͼƬ��Ҳ������xml�����navigation����
			// this.mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.tab_background);
			// ���÷ָ��ߵı�����Tab����һ�����ﵽ���طָ��ߵ�Ч��
			// this.mTabHost.getTabWidget().setDividerDrawable(R.drawable.tab_background);
		}
	}
	
	private View getItemView(int i) {
		View localView = this.mInflater.inflate(R.layout.tab_item, null);
		ImageView imag = (ImageView) localView.findViewById(R.id.tab_img);
		imag.setImageResource(drawables[i]);
		return localView;
	}

}
