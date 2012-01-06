package edu.uchicago.android.lab1dai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NameGetterActivity extends Activity implements OnClickListener 
{
	private static final String TAG = "NameGetterActivity";
	
	private EditText name_fld;
	private Button submit_btn;
	private String user_name;
	
	public void onClick(View v) 
	{
		user_name = name_fld.getText().toString();
		Log.d(TAG, user_name);
		
		Intent it = new Intent(this, HelloWorld.class);
		it.putExtra("name", user_name);
		this.startActivity(it);
	}
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.name_getter);
		name_fld = (EditText)this.findViewById(R.id.editText1);
		submit_btn = (Button)this.findViewById(R.id.button1);
		submit_btn.setOnClickListener(this);
	}
}
