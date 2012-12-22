package uos.okandroid.calc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView textview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textview = (TextView) findViewById(R.id.textView1);
		
		Button button1 = (Button)findViewById(R.id.button1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"1");
			}
		});
		Button button2 = (Button)findViewById(R.id.button2);
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"2");
			}
		});
		Button button3 = (Button)findViewById(R.id.button3);
		
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"3");
			}
		});
		Button button4 = (Button)findViewById(R.id.button4);
		
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"4");
			}
		});
		Button button5 = (Button)findViewById(R.id.button5);
		
		button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"5");
			}
		});
		Button button6 = (Button)findViewById(R.id.button6);
		
		button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"6");
			}
		});
		Button button7 = (Button)findViewById(R.id.button7);
		
		button7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"7");
			}
		});
		Button button8 = (Button)findViewById(R.id.button8);
		
		button8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"8");
			}
		});
		Button button9 = (Button)findViewById(R.id.button9);
		
		button9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"9");
			}
		});
		Button button0 = (Button)findViewById(R.id.button0);
		
		button0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				textview.setText(textview.getText()+"0");
			}
		});
		Button button11 = (Button)findViewById(R.id.button11);
		
		button11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				textview.setText(textview.getText()+"+");
			}
		});
		Button button22 = (Button)findViewById(R.id.button22);
		
		button22.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String nowStr = (String) textview.getText();
				String[] nowArray = nowStr.split("\\+");
				
				int result = 0;
				for (int i = 0; i < nowArray.length; i++)
				{
					result += Integer.parseInt(nowArray[i]);
				}
				textview.setText(textview.getText()+"="+String.valueOf(result));
				
			}
		});
		Button buttonClr = (Button)findViewById(R.id.buttonClr);
		
		buttonClr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				textview.setText("");
			}
		});
		Button buttonDel = (Button)findViewById(R.id.buttonDel);
		
		buttonDel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String nowStr = (String) textview.getText();
				String newStr = nowStr.substring(0, nowStr.length()-1);
				textview.setText(newStr);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
