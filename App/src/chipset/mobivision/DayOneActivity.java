package chipset.mobivision;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DayOneActivity extends Activity {

	TextView someTextTextView, counterTextView;
	Button hideShowButton, incrementButton, decrementButton, dayTwoIntentButton;
	boolean flag = true;
	int x = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setTitle(
				getResources().getString(R.string.title_activity_day_one));
		setContentView(R.layout.activity_day_one);
		someTextTextView = (TextView) findViewById(R.id.someTextTextView);
		hideShowButton = (Button) findViewById(R.id.hideShowButton);
		counterTextView = (TextView) findViewById(R.id.counterTextView);
		incrementButton = (Button) findViewById(R.id.incrementButton);
		decrementButton = (Button) findViewById(R.id.decrementButton);
		dayTwoIntentButton = (Button) findViewById(R.id.dayTwoIntentButton);

		hideShowButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (flag == true) {
					someTextTextView.setVisibility(View.GONE);
					flag = false;
				} else {
					someTextTextView.setVisibility(View.VISIBLE);
					flag = true;
				}

			}
		});

		incrementButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				counterTextView.setText(String.valueOf(x++));

			}
		});
		decrementButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				counterTextView.setText(String.valueOf(x--));

			}
		});

		dayTwoIntentButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(DayOneActivity.this,
						DayTwoActivity.class));

			}
		});
	}
}
