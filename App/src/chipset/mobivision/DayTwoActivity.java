package chipset.mobivision;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DayTwoActivity extends Activity {
	TextView opertationTextView, resultTextView;
	Button operationOneButton, operationTwoButton, operationThreeButton,
			operationFourButton, resultButton, dayThreeIntentButton;
	EditText numOneEditText, numTwoEditText;
	String op, res, num1, num2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_day_two);
		getActionBar().setTitle(
				getResources().getString(R.string.title_activity_day_two));

		opertationTextView = (TextView) findViewById(R.id.opertationTextView);
		resultTextView = (TextView) findViewById(R.id.resultTextView);

		operationOneButton = (Button) findViewById(R.id.operationOneButton);
		operationTwoButton = (Button) findViewById(R.id.operationTwoButton);
		operationThreeButton = (Button) findViewById(R.id.operationThreeButton);
		operationFourButton = (Button) findViewById(R.id.operationFourButton);
		resultButton = (Button) findViewById(R.id.resultButton);
		dayThreeIntentButton = (Button) findViewById(R.id.dayThreeIntentButton);

		numOneEditText = (EditText) findViewById(R.id.numOneEditText);
		numTwoEditText = (EditText) findViewById(R.id.numTwoEditText);

		op = null;

		operationOneButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				op = operationOneButton.getText().toString();
				opertationTextView.setText(op);

			}
		});

		operationTwoButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				op = operationTwoButton.getText().toString();
				opertationTextView.setText(op);

			}
		});

		operationThreeButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				op = operationThreeButton.getText().toString();
				opertationTextView.setText(op);

			}
		});

		operationFourButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				op = operationFourButton.getText().toString();
				opertationTextView.setText(op);

			}
		});

		resultButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				num1 = numOneEditText.getText().toString();
				num2 = numTwoEditText.getText().toString();
				if (opertationTextView.getText().toString().isEmpty()) {
					Toast.makeText(getApplicationContext(),
							"Choose an operation", Toast.LENGTH_SHORT).show();
				} else if (num1.isEmpty() || num2.isEmpty()) {
					Toast.makeText(getApplicationContext(),
							"Enter the numbers", Toast.LENGTH_SHORT).show();
				} else {
					try {
						switch (op) {
						case "+":
							res = String.valueOf(Integer.parseInt(num1)
									+ Integer.parseInt(num2));
							break;
						case "-":
							res = String.valueOf(Integer.parseInt(num1)
									- Integer.parseInt(num2));
							break;
						case "*":
							res = String.valueOf(Integer.parseInt(num1)
									* Integer.parseInt(num2));
							break;
						case "/":
							res = String.valueOf(Integer.parseInt(num1)
									/ Integer.parseInt(num2));
							break;
						}
						resultTextView.setText(res);
					} catch (Exception e) {
						Toast.makeText(getApplicationContext(),
								"Division by Zero error", Toast.LENGTH_SHORT)
								.show();
						e.printStackTrace();
					}
				}

			}
		});

		dayThreeIntentButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(DayTwoActivity.this,
						DayThreeActivity.class));
			}
		});
	}
}
