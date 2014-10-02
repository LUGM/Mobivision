package chipset.mobivision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ListViewAdapter extends BaseAdapter {

	LayoutInflater inflater;
	String[] text1, text2;
	int[] images;
	Context context;

	public ListViewAdapter(Context context, String[] text1, String[] text2,
			int[] images) {
		this.text1 = text1;
		this.text2 = text2;
		this.images = images;
		this.context = context;
		this.inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return text1.length;
	}

	@Override
	public Object getItem(int arg0) {
		return text1;
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		if (arg1 == null) {
			arg1 = inflater.inflate(R.layout.list_item, null);
		}
		TextView titleTextView, subtitleTextView;
		ImageView imageView;

		titleTextView = (TextView) arg1.findViewById(R.id.titleTextView);
		subtitleTextView = (TextView) arg1.findViewById(R.id.subtitleTextView);
		imageView = (ImageView) arg1.findViewById(R.id.imageView);

		titleTextView.setText(text1[arg0]);
		subtitleTextView.setText(text2[arg0]);

		Picasso.with(context).load(images[arg0]).into(imageView);

		return arg1;
	}
}
