package com.kelcamer.remaclek;






import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class showc extends Activity implements OnClickListener {

	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		


		setContentView(R.layout.showcheck);
		
			
			
			// Changes the screen to showcheck
						Button mouth = (Button)findViewById(R.id.mouth);
						Button jump = (Button)findViewById(R.id.jump);
						Button read = (Button)findViewById(R.id.read);
						Button mirror = (Button)findViewById(R.id.mirror);
						Button fly = (Button)findViewById(R.id.fly);
						Button magic = (Button)findViewById(R.id.magic);
						Button watch = (Button)findViewById(R.id.watch);
						Button palms = (Button)findViewById(R.id.palms);
						Button math = (Button)findViewById(R.id.math);
						Button vision = (Button)findViewById(R.id.vision);
						Button ask = (Button)findViewById(R.id.ask);
						Button induce = (Button)findViewById(R.id.induce);
						
						
						

						
					
						// Listens for the click.
						mouth.setOnClickListener(listen);
						jump.setOnClickListener(listen);
						read.setOnClickListener(listen);		
						mirror.setOnClickListener(listen);	
						fly.setOnClickListener(listen);	
						magic.setOnClickListener(listen);	
						watch.setOnClickListener(listen);
						palms.setOnClickListener(listen);
						math.setOnClickListener(listen);
						vision.setOnClickListener(listen);
						ask.setOnClickListener(listen);
						induce.setOnClickListener(listen);
			
			
		
				
			
					
					 
					
	}
		
	
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}



	
	
		
	



	public void string_activity(View button, String message){
	
		//String test = "Hello World";
		//intent.putExtra(EXTRA_Main.message, test);
		Intent intent = new Intent(showc.this, journal.class);
		Main.name = Main.message;
		
		startActivity(intent);
		
		
		
	}




	OnClickListener listen = new OnClickListener(){
		@Override
		public void onClick(View v) {
		
		// TODO Auto-generated method stub
			 if(v == findViewById(R.id.mouth)){
			
			// This code works.  
			Main.message = getText(R.string.checkData1).toString();
			
			string_activity((Button)findViewById(R.id.mouth), Main.message);
			
			
		}
		else if(v == findViewById(R.id.jump)){
			
			// This code works.  
			Main.message = getText(R.string.checkData2).toString();
			
			string_activity((Button)findViewById(R.id.jump), Main.message);
			
			
		}
		else if(v == findViewById(R.id.read)){
			
			// This code works.  
			Main.message = getText(R.string.checkData3).toString();
			
			string_activity((Button)findViewById(R.id.jump), Main.message);
			
			
		}
		else if(v == findViewById(R.id.mirror)){
			
			// This code works.  
			Main.message = getText(R.string.checkData4).toString();
			
			string_activity((Button)findViewById(R.id.mirror), Main.message);
			
			
		}
		else if(v == findViewById(R.id.fly)){
			
			// This code works.  
			Main.message = getText(R.string.checkData5).toString();
			
			string_activity((Button)findViewById(R.id.fly), Main.message);
			
			
		}
		else if(v == findViewById(R.id.magic)){
			
			// This code works.  
			Main.message = getText(R.string.checkData6).toString();
			
			string_activity((Button)findViewById(R.id.magic), Main.message);
			
			
		}
		else if(v == findViewById(R.id.watch)){
			
			// This code works.  
			Main.message = getText(R.string.checkData7).toString();
			
			string_activity((Button)findViewById(R.id.watch), Main.message);
			
			
		}
		else if(v == findViewById(R.id.palms)){
			
			// This code works.  
			Main.message = getText(R.string.checkData8).toString();
			
			string_activity((Button)findViewById(R.id.palms), Main.message);
			
			
		}
		else if(v == findViewById(R.id.math)){
			
			// This code works.  
			Main.message = getText(R.string.checkData9).toString();
			
			string_activity((Button)findViewById(R.id.math), Main.message);
			
			
		}
		else if(v == findViewById(R.id.vision)){
			
			// This code works.  
			Main.message = getText(R.string.checkData10).toString();
			
			string_activity((Button)findViewById(R.id.vision), Main.message);
			
			
		}
		else if(v == findViewById(R.id.ask)){
			
			// This code works.  
			Main.message = getText(R.string.checkData11).toString();
			
			string_activity((Button)findViewById(R.id.ask), Main.message);
			
			
		}
		else if(v == findViewById(R.id.induce)){
			
			// This code works.  
			Main.message = getText(R.string.checkData12).toString();
			
			string_activity((Button)findViewById(R.id.induce), Main.message);
			
			
		}
		}
	};

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}


	
}


/*
 * 
 * 
 * 		// TODO Auto-generated method stub
		
 * 
 * 
 * 
 * 
 */








