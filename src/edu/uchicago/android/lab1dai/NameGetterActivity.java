package edu.uchicago.android.lab1dai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NameGetterActivity extends Activity 
{
	private static final String TAG = "NameGetterActivity";
	
	private EditText name_fld;
	private Button submit_btn;
	private Button test_btn;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.name_getter);
		
		name_fld = (EditText)this.findViewById(R.id.editText1);
		submit_btn = (Button)this.findViewById(R.id.button1);
		test_btn = (Button)this.findViewById(R.id.button2);
		
		submit_btn.setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						Log.d(TAG, name_fld.getText().toString());
						
						Intent i = new Intent(NameGetterActivity.this, HelloWorldActivity.class);
						i.putExtra("name", name_fld.getText().toString());
						startActivity(i);
					}
				}
			);
		
		test_btn.setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						Log.d(TAG, "sensor activity button pressed");
						
						Intent i = new Intent(NameGetterActivity.this, SensorActivity.class);
						startActivity(i);
					}
				}
			);
	}
	
}
