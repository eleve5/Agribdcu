package com.example.agribdcu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	Button camera, about;
	ImageView pic;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pic = (ImageView) findViewById(R.id.imagepic);
		camera = (Button) findViewById(R.id.cam);
		about = (Button) findViewById(R.id.abt);

		about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						AboutActivity.class);
				startActivity(intent);
			}
		});

		camera.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ins = new Intent(MainActivity.this, CameraActivity.class);
				startActivity(ins);

			}
		});

	}

}
