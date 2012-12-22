package uos.okandroid.calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textview;
	Boolean isStarted = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textview = (TextView) findViewById(R.id.textView1);
		
		Button button1 = (Button)findViewById(R.id.button1);
		Button button2 = (Button)findViewById(R.id.button2);
		Button button3 = (Button)findViewById(R.id.button3);
		Button button4 = (Button)findViewById(R.id.button4);
		Button button5 = (Button)findViewById(R.id.button5);
		Button button6 = (Button)findViewById(R.id.button6);
		Button button7 = (Button)findViewById(R.id.button7);
		Button button8 = (Button)findViewById(R.id.button8);
		Button button9 = (Button)findViewById(R.id.button9);
		Button button0 = (Button)findViewById(R.id.button0);
		Button buttonplus = (Button)findViewById(R.id.button11);
		Button buttonequal = (Button)findViewById(R.id.button22);
		Button buttonClr = (Button)findViewById(R.id.buttonClr);
		Button buttonDel = (Button)findViewById(R.id.buttonDel);
		
		View.OnClickListener listener = new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				checkMode();
				String string = ((Button)v).getText().toString();
				textview.setText(textview.getText() + string);
			}
		};
		
		button1.setOnClickListener(listener);
		button2.setOnClickListener(listener);
		button3.setOnClickListener(listener);
		button4.setOnClickListener(listener);
		button5.setOnClickListener(listener);
		button6.setOnClickListener(listener);
		button7.setOnClickListener(listener);
		button8.setOnClickListener(listener);
		button9.setOnClickListener(listener);
		button0.setOnClickListener(listener);
		buttonplus.setOnClickListener(listener);
		
		buttonequal.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				textview.setText(getResult());
			}
		});
		buttonClr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				isStarted = false;
				textview.setText("");
			}
		});
		
		buttonDel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String nowStr = (String) textview.getText();
				String newStr = nowStr.substring(0, nowStr.length()-1);
				textview.setText(newStr);
			}
		});
	
	}
	protected CharSequence getResult() {
		String text = textview.getText().toString();
		String[] array = text.split("\\+");
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += Integer.parseInt(array[i]);
		}
		return String.valueOf(result);
	}

	public void checkMode() {
		if (!isStarted) {
			textview.setText("");
			isStarted = true;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
