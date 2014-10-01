package chipset.mobivision;

import com.squareup.picasso.Picasso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
		TextView tv1, tv2;
		ImageView image;

		tv1 = (TextView) arg1.findViewById(R.id.tv1);
		tv2 = (TextView) arg1.findViewById(R.id.tv2);
		image = (ImageView) arg1.findViewById(R.id.image);

		tv1.setText(text1[arg0]);
		tv2.setText(text2[arg0]);

		Picasso.with(context).load(images[arg0]).into(image);

		return arg1;
	}
}
