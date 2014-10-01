package chipset.mobivision;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class DayThreeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_day_three);
		getActionBar().setTitle(
				getResources().getString(R.string.title_activity_day_three));

		ListView list = (ListView) findViewById(R.id.listView);

		final String text1[] = { "Hello", "Android", "Workshop", "Custom",
				"ListView" };
		final String text2[] = { "Hi", "This", "is", "really", "nice" };
		int[] images = { R.drawable.image1, R.drawable.image2,
				R.drawable.image3, R.drawable.image4, R.drawable.image5 };

		list.setAdapter(new ListViewAdapter(getApplicationContext(), text1,
				text2, images));

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				String text = text1[arg2] + "\n" + text2[arg2];
				Toast.makeText(getApplicationContext(), text,
						Toast.LENGTH_SHORT).show();

			}
		});
	}
}
