package com.example.agribdcu;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class AboutActivity extends Activity {
	
	ImageView im;
	TextView tx1,txbelow;
	ScrollView scl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		tx1=(TextView) findViewById(R.id.textView1);
		txbelow=(TextView) findViewById(R.id.textView2);
		
		scl=new ScrollView(this);
		scl.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
		
	}

	

}
