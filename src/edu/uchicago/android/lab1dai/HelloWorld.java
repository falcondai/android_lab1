package edu.uchicago.android.lab1dai;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HelloWorld extends Activity {
	private static final String TAG = "HelloWorld"; 
	private String name = "";
	private TextView tv;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greeting);
        
        tv = (TextView)this.findViewById(R.id.greeting);
        if (this.getIntent().getExtras() != null)
        {
        	name = this.getIntent().getExtras().getString("name");
        	Log.d(TAG, name);
        	Log.d(TAG, Integer.toString(name.length()));
        	
	        if (name.length() !=0)
	        {
	        	tv.setText("Hello, "+name+"!");
	        	
	        	return ;
	        }
        }
        
        tv.setText("Hello, stranger!");
    }
}