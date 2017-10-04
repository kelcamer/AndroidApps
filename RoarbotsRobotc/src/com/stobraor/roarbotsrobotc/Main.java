package com.stobraor.roarbotsrobotc;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
	public static String text;
	public static String message;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button about = (Button)findViewById(R.id.about);
		Button setup = (Button)findViewById(R.id.setup);
		Button variables = (Button)findViewById(R.id.variables);
		Button math = (Button)findViewById(R.id.math);
		
		Button decisions = (Button)findViewById(R.id.decisions);
		Button loops = (Button)findViewById(R.id.loops);
		Button functions = (Button)findViewById(R.id.functions);
		Button arrays = (Button)findViewById(R.id.arrays);
		Button timers = (Button)findViewById(R.id.timers);
		Button motors = (Button)findViewById(R.id.motors);
		Button joy = (Button)findViewById(R.id.joystick);
		Button sensors = (Button)findViewById(R.id.sensors);

	
		
		// Sets the onClick function for each button
		about.setOnClickListener(listen);
		setup.setOnClickListener(listen);
		variables.setOnClickListener(listen);
		math.setOnClickListener(listen);
	
		decisions.setOnClickListener(listen);
		loops.setOnClickListener(listen);
		functions.setOnClickListener(listen);
		arrays.setOnClickListener(listen);
		timers.setOnClickListener(listen);
		motors.setOnClickListener(listen);
		joy.setOnClickListener(listen);
		sensors.setOnClickListener(listen);
	
	}

	
	OnClickListener listen = new OnClickListener(){
		@Override
		public void onClick(View v) {
			
			if(v==findViewById(R.id.about)){
				Main.message = getText(R.string.checkData1).toString();
				
				changeText((Button)findViewById(R.id.about), Main.message);
				
			}
			else if(v==findViewById(R.id.setup)){
				
				Main.message = getText(R.string.checkData2).toString();
				
				changeText((Button)findViewById(R.id.setup), Main.message);
			}
			else if(v==findViewById(R.id.variables)){
				
				Main.message = getText(R.string.checkData3).toString();
				
				changeText((Button)findViewById(R.id.variables), Main.message);
			}
			else if(v==findViewById(R.id.math)){
				Main.message = getText(R.string.checkData4).toString();
				
				changeText((Button)findViewById(R.id.math), Main.message);
				
			}
			
			else if(v==findViewById(R.id.decisions)){
				
				Main.message = getText(R.string.checkData6).toString();
				
				changeText((Button)findViewById(R.id.decisions), Main.message);
			}
			else if(v==findViewById(R.id.loops)){
				
				Main.message = getText(R.string.checkData7).toString();
				
				changeText((Button)findViewById(R.id.loops), Main.message);
			}
			else if(v==findViewById(R.id.functions)){
				
				Main.message = getText(R.string.checkData8).toString();
				
				changeText((Button)findViewById(R.id.functions), Main.message);
			}
			else if(v==findViewById(R.id.arrays)){
				Main.message = getText(R.string.checkData9).toString();
				
				changeText((Button)findViewById(R.id.arrays), Main.message);
				
			}
			else if(v==findViewById(R.id.timers)){
				Main.message = getText(R.string.checkData10).toString();
				
				changeText((Button)findViewById(R.id.timers), Main.message);
				
			}
			else if(v==findViewById(R.id.motors)){
				Main.message = getText(R.string.checkData11).toString();
				
				changeText((Button)findViewById(R.id.motors), Main.message);
				
			}
			else if(v==findViewById(R.id.joystick)){
				Main.message = getText(R.string.checkData12).toString();
				
				changeText((Button)findViewById(R.id.joystick), Main.message);
				
			}
			else if(v==findViewById(R.id.sensors)){
				
				Main.message = getText(R.string.checkData13).toString();
				
				changeText((Button)findViewById(R.id.sensors), Main.message);
			}
	
			
			
			
			
		}


};
	
public void onClick(View v) {
	// TODO Auto-generated method stub
	// Do not delete me!
	
}
public void changeText(View button, String message){
	
	Intent intent = new Intent(Main.this, Jour.class);
	Main.text = message;
	
	startActivity(intent);
	
	
	
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
}
}
