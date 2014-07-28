package com.spamgame.myset.adapter;

import java.util.ArrayList;

import com.spamgame.myset.R;
import com.spamgame.myset.util.SETObject;

import android.content.Context;
import android.graphics.Color;
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
	private ArrayList<SETObject> data;
	private FavouriteItemViewHolder viewHolder;
	
	public FavouriteAdapter(Context context, ArrayList<SETObject> values) {
		//super(context, android.R.layout.simple_list_item_1);
		
		this.context = context;
		this.data = values;
		
		this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub		
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.list_favourite_item, parent, false);
			
			viewHolder = new FavouriteItemViewHolder();
			viewHolder.textCode = (TextView)convertView.findViewById(R.id.text_favourite_code);
			viewHolder.textValue = (TextView)convertView.findViewById(R.id.text_favourite_value);
			viewHolder.textValueChange = (TextView)convertView.findViewById(R.id.text_favourite_change_value);
			viewHolder.textValueChangePercent = (TextView)convertView.findViewById(R.id.text_favourite_change_percent);
			
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (FavouriteItemViewHolder)convertView.getTag();
		}
		
		SETObject obj = data.get(position);
		
		viewHolder.textCode.setText(obj.getCode());
		viewHolder.textValue.setText(Double.toString(obj.getPrice()));
		viewHolder.textValueChange.setText(Double.toString(obj.getPriceChange()));
		viewHolder.textValueChangePercent.setText(Double.toString(obj.getPriceChangePercent()));
		
		if (obj.getPriceChange() == 0) {
			viewHolder.textValue.setTextColor(Color.YELLOW);
			viewHolder.textValueChange.setTextColor(Color.YELLOW);
			viewHolder.textValueChangePercent.setTextColor(Color.YELLOW);
		} else if (obj.getPriceChange() > 0) {
			viewHolder.textValue.setTextColor(Color.GREEN);
			viewHolder.textValueChange.setTextColor(Color.GREEN);
			viewHolder.textValueChangePercent.setTextColor(Color.GREEN);
		} else {
			viewHolder.textValue.setTextColor(Color.RED);
			viewHolder.textValueChange.setTextColor(Color.RED);
			viewHolder.textValueChangePercent.setTextColor(Color.RED);
		}
		
		return convertView;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.data.size();
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
		TextView textCode;
		TextView textValue;
		TextView textValueChange;
		TextView textValueChangePercent;
	}
}
