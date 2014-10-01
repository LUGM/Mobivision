package chipset.mobivision;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DayOneActivity extends Activity {

	TextView textView1, textView2;
	Button button1, button2, button3, button4;
	boolean flag = true;
	int x = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setTitle(
				getResources().getString(R.string.title_activity_day_one));
		setContentView(R.layout.activity_day_one);
		textView1 = (TextView) findViewById(R.id.textView1);
		button1 = (Button) findViewById(R.id.Button1);
		textView2 = (TextView) findViewById(R.id.textView2);
		button2 = (Button) findViewById(R.id.Button2);
		button3 = (Button) findViewById(R.id.Button3);
		button4 = (Button) findViewById(R.id.Button4);

		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (flag == true) {
					textView1.setVisibility(View.GONE);
					flag = false;
				} else {
					textView1.setVisibility(View.VISIBLE);
					flag = true;
				}

			}
		});

		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				textView2.setText(String.valueOf(x++));

			}
		});
		button3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				textView2.setText(String.valueOf(x--));

			}
		});

		button4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(DayOneActivity.this,
						DayTwoActivity.class));

			}
		});
	}
}
