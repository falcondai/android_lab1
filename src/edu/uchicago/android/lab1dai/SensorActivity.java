package edu.uchicago.android.lab1dai;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SensorActivity extends Activity implements SensorEventListener{
	public static final String TAG = "SensorActivity";

	private SensorManager sm;
	private Sensor s;

	//to calculate update frequency
	private long previousTime;

	//	TODO implements delay switch 

	//UI components
	private TextView data;
	private TextView rate;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//Initialize UI
		setContentView(R.layout.sensor);
		data = (TextView)this.findViewById(R.id.data);
		rate = (TextView)this.findViewById(R.id.rate);

		sm = (SensorManager)getSystemService(SENSOR_SERVICE);
		Log.d(TAG, sm.toString());
		s = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		Log.d(TAG, s.toString());
	}

	@Override
	protected void onResume() {
		super.onResume();
		sm.registerListener(this, s, SensorManager.SENSOR_DELAY_FASTEST);
	}

	@Override
	protected void onPause() {
		super.onPause();
		sm.unregisterListener(this);
	}

	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub

	}

	public void onSensorChanged(SensorEvent event) {
		Log.d(TAG, event.toString());
		Log.d(TAG, event.values.toString());
		//display sensor event content
		data.setText("accuracy: "+event.accuracy+'\n'+
				"timestamp: "+event.timestamp+'\n'+
				"values[0]: "+Float.toString(event.values[0])+'\n'+
				"values[1]: "+Float.toString(event.values[1])+'\n'+
				"values[2]: "+Float.toString(event.values[2])+'\n'
				);
		//display sensor event frequency
		rate.setText(this.getString(R.string.rate)
				+Float.toString(1e9f/(event.timestamp-previousTime))+"Hz");
		previousTime = event.timestamp;
	}
}
