package edu.uchicago.android.lab1dai;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;

// TODO put back implements SensorEventListener and get it to work 
public class SensorStatusActivity extends Activity {
	private static final String TAG = "SensorStatusActivity";
	
	private SensorManager mSensorMgr;
	private Sensor mAcc;
	
	public void OnCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.setContentView(R.layout.sensor_status);
		/*
		mSensorMgr = (SensorManager)getSystemService(SENSOR_SERVICE);
		Log.d(TAG, mSensorMgr.getSensorList(Sensor.TYPE_ACCELEROMETER).toString());
		
		mAcc = mSensorMgr.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		
		if (mAcc != null) {
			Log.d(TAG, mAcc.toString());
		}
		else
		{
			Log.d(TAG, "no mAcc");
		}
		*/
	}
	/*
	protected void onResume() {
		super.onResume();
		//mSensorMgr.registerListener(this, mAcc, SensorManager.SENSOR_DELAY_NORMAL);
	}
	
	protected void onPause() {
		super.onPause();
		//mSensorMgr.unregisterListener(this);
	}

	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		
	}
	*/
}
