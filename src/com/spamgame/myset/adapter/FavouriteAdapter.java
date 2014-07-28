package com.spamgame.myset.adapter;

import com.spamgame.myset.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class FavouriteAdapter extends BaseAdapter {

	private Context context;
	private int layout;
	private LayoutInflater inflater;
	private String[] data;
	private FavouriteItemViewHolder viewHolder;
	
	public FavouriteAdapter(Context context, String[] values) {
		//super(context, android.R.layout.simple_list_item_1);
		
		this.context = context;
		this.data = values;
		
		this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = null;
		
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.list_favourite_item, parent, false);
			
			viewHolder = new FavouriteItemViewHolder();
			viewHolder.text1 = (TextView)convertView.findViewById(R.id.text_favourite_code);
			viewHolder.text2 = (TextView)convertView.findViewById(R.id.text_favourite_value);
			
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (FavouriteItemViewHolder)convertView.getTag();
		}
		
		viewHolder.text1.setText("Test+++++123");
		viewHolder.text2.setText("What");
		
		
		return convertView;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.data.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	static class FavouriteItemViewHolder {
		TextView text1;
		TextView text2;
	}
}
