package com.foodnotes.view;

import com.example.foodnotes.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class StartActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		Toast.makeText(this, "text", 3).show();
	}

}
