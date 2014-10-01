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
	TextView opText, resText;
	Button op1Button, op2Button, op3Button, op4Button, resButton, day3Button;
	EditText num1EditText, num2EditText;
	String op, res, num1, num2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_day_two);
		getActionBar().setTitle(
				getResources().getString(R.string.title_activity_day_two));

		opText = (TextView) findViewById(R.id.op);
		resText = (TextView) findViewById(R.id.res);

		op1Button = (Button) findViewById(R.id.op1);
		op2Button = (Button) findViewById(R.id.op2);
		op3Button = (Button) findViewById(R.id.op3);
		op4Button = (Button) findViewById(R.id.op4);
		resButton = (Button) findViewById(R.id.calc);
		day3Button = (Button) findViewById(R.id.gotoDay3);

		num1EditText = (EditText) findViewById(R.id.num1);
		num2EditText = (EditText) findViewById(R.id.num2);

		op = null;

		op1Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				op = op1Button.getText().toString();
				opText.setText(op);

			}
		});

		op2Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				op = op2Button.getText().toString();
				opText.setText(op);

			}
		});

		op3Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				op = op3Button.getText().toString();
				opText.setText(op);

			}
		});

		op4Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				op = op4Button.getText().toString();
				opText.setText(op);

			}
		});

		resButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				num1 = num1EditText.getText().toString();
				num2 = num2EditText.getText().toString();
				if (opText.getText().toString().isEmpty()) {
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
						resText.setText(res);
					} catch (Exception e) {
						Toast.makeText(getApplicationContext(),
								"Division by Zero error", Toast.LENGTH_SHORT)
								.show();
						e.printStackTrace();
					}
				}

			}
		});

		day3Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(DayTwoActivity.this,
						DayThreeActivity.class));
			}
		});
	}
}
